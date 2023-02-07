package com.nttdata.auth.types;


import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nttdata.config.AuthProperties;
import com.nttdata.config.BeanUtil;

import lombok.extern.slf4j.Slf4j;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * custom TDP auth class, this auth use an API suscription key and Bearer
 * token(semilla) provided by Telefonica for each API
 * 
 * @author lbonillc
 *
 */
@Slf4j
public class CustomTDPAuthService {

	public static final MediaType JSON = MediaType.get("application/x-www-form-urlencoded; charset=utf-8");

	@Autowired
	private AuthProperties authProperties;

	@PostConstruct
	private void init() {
		authProperties = (AuthProperties) BeanUtil.getConfig("authProperties");
	}

	private final OkHttpClient client = new OkHttpClient.Builder().connectTimeout(160, TimeUnit.SECONDS)
			.readTimeout(60, TimeUnit.SECONDS).writeTimeout(60, TimeUnit.SECONDS).build();

	private static final ObjectMapper mapper = new ObjectMapper();

	/**
	 * This method read clientId and secret from properties file, then send POST request to auth server and receive the bearer token
	 * for specific API
	 * @param target
	 * @return Bearer Token
	 */
	public String addAutHeader(String target) {
		
		if(authProperties == null) {
			init();
		}

		String token = "";
		
		
		ClientCredential clientCredential = authProperties.getClientCredential().get(target.toLowerCase());
		

		try {

			RequestBody reqbody = RequestBody.create(null, new byte[0]); 
			Request request = new Request.Builder().url(clientCredential.getUrlWellKnow())
					.addHeader("Ocp-Apim-Subscription-Key", clientCredential.getClientId())
					.addHeader("Authorization", clientCredential.getClientSecret())
					.post(reqbody)
					.build();
			Response rsIAM = client.newCall(request).execute();
			token = mapper.readTree(rsIAM.body().string()).get("access_token").asText();

		} catch (Exception e) {
			log.error("Authentication error {} ", e);
		}

		return "Bearer "+token;

	}

}
