package com.nttdata.interceptor;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.nttdata.auth.types.APIKeyAuthService;
import com.nttdata.auth.types.AuthType;
import com.nttdata.auth.types.BasicAuthService;
import com.nttdata.auth.types.ClientCredential;
import com.nttdata.config.AuthProperties;
import com.nttdata.config.BeanUtil;

import lombok.extern.slf4j.Slf4j;
import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Slf4j
//@Component
public class AuthRequestInterceptor extends AuthenticathorParent implements Interceptor {

	public AuthRequestInterceptor(String type, String target) {
		super(type, target);
	}

	public static final String AUTHORIZATION_HEADER = "Authorization";
	public static final String AUTHORIZATION_TOKEN_AUTH = "X-AUTH-TOKEN";
	private static final String BEARER_TOKEN_TYPE = "Bearer ";
	public static final MediaType JSON = MediaType
			.get("application/x-www-form-urlencoded; charset=utf-8");

	private AuthProperties authProperties;

	private BasicAuthService basicAuthService;
	
	private APIKeyAuthService aPIKeyAuthService;
	
	@PostConstruct
	private void init() {
		authProperties = (AuthProperties) BeanUtil.getConfig("authProperties");
		basicAuthService = new BasicAuthService();
		aPIKeyAuthService = new APIKeyAuthService();
	}
	
	
	private final OkHttpClient client = new OkHttpClient.Builder()
			.connectTimeout(160, TimeUnit.SECONDS).readTimeout(60, TimeUnit.SECONDS)
			.writeTimeout(60, TimeUnit.SECONDS).build();

	private static final ObjectMapper mapper = new ObjectMapper();

	public String addAutHeader(String target) {

		String token = "";
		Response response;
		
		
		ClientCredential clientCredential = authProperties.getClientCredential().get(target.toLowerCase());
		

		try {
			Request request = new Request.Builder().url(clientCredential.getUrlWellKnow()).build();
			response = client.newCall(request).execute();
			ResponseBody rs = response.body();
			JsonNode rsNode = mapper.readTree(rs.string());

			String urlIAM = rsNode.get("token_endpoint").asText();

			RequestBody formBody = new FormBody.Builder()
					.add("grant_type", clientCredential.getGrantType())
					.add("client_id", clientCredential.getClientId())
					.add("client_secret", clientCredential.getClientSecret())
					.add("scope", clientCredential.getScope())
					.build();

			request = new Request.Builder().url(urlIAM).addHeader("Accept", "*/*")
					.addHeader("Content-Type", "application/x-www-form-urlencoded").post(formBody)
					.build();
			Response rsIAM = client.newCall(request).execute();
			token = mapper.readTree(rsIAM.body().string()).get("access_token").asText();

		} catch (Exception e) {
			log.error("Authentication error {} ", e);
		}

		return "Bearer "+token;

	}
	
	
	
	public String addAut2TokenHeader(String target) {

		String token = "";
		Response response;
		
		
		ClientCredential clientCredential = authProperties.getClientCredential().get(target.toLowerCase());
		

		try {
			Request request = null;
			
			JsonNode node = mapper.createObjectNode();
			ObjectNode obj = (ObjectNode) node;

			obj.put("grantType", clientCredential.getGrantType());
			obj.put("userName", clientCredential.getClientId());
			obj.put("value", clientCredential.getClientSecret());
			
			
			
			String json = mapper.writeValueAsString(obj);
			log.info("request token ::"  + json);
			
			final MediaType JSON1 = MediaType
					.get("application/json; charset=utf-8");

			RequestBody body = RequestBody.create(JSON1, json);

			request = new Request.Builder().url(clientCredential.getUrlWellKnow()).addHeader("Accept", "application/json")
					.addHeader("Content-Type", "application/json").put(body)
					.build();
			Response rsIAM = client.newCall(request).execute();
			String respuesta = rsIAM.body().string();
			log.info("response token ::"  + respuesta);
			token = mapper.readTree(respuesta).get(clientCredential.getReturnToken()).asText();

		} catch (Exception e) {
			log.error("Authentication error huaweii  {} ", e);
		}
		log.info("token huaewi :: " + token);
		return token;

	}

	/**
	 * 
	 */
	@Override
	public Response intercept(Chain chain) throws IOException {
		
		Request newRequest = null;
		Request request = chain.request();
		try {
			
			
			
			if(null == this.authProperties)
				init();
			
			if(this.type.equals(AuthType.OAUTH2.toString())) {
				
				newRequest = request.newBuilder().addHeader(AUTHORIZATION_HEADER, addAutHeader(this.target)).build();
			
			}else if(this.type.equals(AuthType.BASIC.toString())) {
				
				newRequest = request.newBuilder().addHeader(AUTHORIZATION_HEADER, basicAuthService.getCredentials(this.target)).build();
			
			}else if(this.type.equals(AuthType.API_KEY.toString())) {
				
				newRequest = request.newBuilder().addHeader(aPIKeyAuthService.getAPIKey(this.target.toLowerCase()).getHeader(), aPIKeyAuthService.getAPIKey(this.target.toLowerCase()).getKey()).build();
				
			}else if(this.type.equals(AuthType.OAUTH2_TOKEN.toString())) {
				
				newRequest = request.newBuilder().addHeader(AUTHORIZATION_TOKEN_AUTH, addAut2TokenHeader(this.target)).build();
				
			}

			
		}catch(Exception e) {
			log.warn("Authentication Interceptor failed >> {} ", e);
		}

		return chain.proceed(newRequest!= null? newRequest:request);
	}
	
	
	
	

}
