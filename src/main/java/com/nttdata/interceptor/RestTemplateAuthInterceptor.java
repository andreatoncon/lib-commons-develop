package com.nttdata.interceptor;

import java.io.IOException;
import java.util.UUID;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import com.nttdata.auth.types.APIKeyAuthService;
import com.nttdata.auth.types.APIKeyCredential;
import com.nttdata.auth.types.AuthType;
import com.nttdata.auth.types.BasicAuthService;
import com.nttdata.auth.types.CustomTDPAuthService;
import com.nttdata.auth.types.Target;

import lombok.extern.slf4j.Slf4j;

//@Component
@Slf4j
public class RestTemplateAuthInterceptor extends AuthenticathorParent implements ClientHttpRequestInterceptor{ 
	
	public RestTemplateAuthInterceptor(String type, String target) {
		super(type, target);
		
		aPIKeyAuthService = new APIKeyAuthService();
		authRequestInterceptor = new AuthRequestInterceptor(type, target);
		basicAuthService = new BasicAuthService();
		customTDPAuthService = new CustomTDPAuthService();
		
	}

	private AuthRequestInterceptor authRequestInterceptor;
	private BasicAuthService basicAuthService;
	private APIKeyAuthService aPIKeyAuthService;
	private CustomTDPAuthService customTDPAuthService;
	
	@Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
		
		ClientHttpResponse response = null;
		
		try {
			
			if(this.type.equals(AuthType.BASIC.toString())) {
				
				request.getHeaders().add(AuthRequestInterceptor.AUTHORIZATION_HEADER, basicAuthService.getCredentials(this.target));
			
			}else if(this.type.equals(AuthType.OAUTH2.toString())) {
				
				request.getHeaders().add(AuthRequestInterceptor.AUTHORIZATION_HEADER, authRequestInterceptor.addAutHeader(this.target));
			
			}else if(this.type.equals(AuthType.API_KEY.toString())) {
				
				/*When target is Telefonica apimngr-genesis*/
				if(request.getURI().getHost().contains("apimngr-genesis") ){
					
					// add suscription for API target
					APIKeyCredential aPIKeyCredential = aPIKeyAuthService.getAPIKey(Target.TELEFONICA.toString().toLowerCase());
					request.getHeaders().add(aPIKeyCredential.getHeader(),aPIKeyCredential.getKey());
					
				    // add Bearer token for API
					request.getHeaders().add(AuthRequestInterceptor.AUTHORIZATION_HEADER, customTDPAuthService.addAutHeader(Target.TELEFONICA.toString()));
					
					// add custom header to telefonica APIM
					
					request.getHeaders().add("UNICA-Application","PANGEA");
					request.getHeaders().add("UNICA-ServiceId",UUID.fromString("dd8bd493-bb75-48a7-9d4c-b3d85c09276f").toString());
					final String rqid = UUID.randomUUID().toString();
					request.getHeaders().add("UNICA-PID",rqid);
					request.getHeaders().add("UNICA-User","PANGEA-OSS");
					log.info("Request ID {} ", rqid);
					
					
				}else {
					
					APIKeyCredential aPIKeyCredential = aPIKeyAuthService.getAPIKey(target);
					request.getHeaders().add(aPIKeyCredential.getHeader(),aPIKeyCredential.getKey());
				}
				
				
				
			}	
			
			
		}catch(Exception e) {
			log.error("Interceptor RestTemplate failed, >> {}", e);
		}finally {
			response = execution.execute(request, body);
		}
        
        
        return response;
    }
	

}
