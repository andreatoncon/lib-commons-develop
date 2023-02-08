package com.nttdata.interceptor;

import java.io.IOException;
import java.util.UUID;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

@Slf4j
public class LogginRequestInterceptor implements Interceptor {
	
	private final ObjectMapper objectMapper= new ObjectMapper();

	@Override
	public Response intercept(Chain chain) throws IOException {
		
		Request request = chain.request();
		Request newRequest = null;
		if(chain.request() != null) {
			
			
			try {
				
				if (request.header("unique_id")!=null) {
					
					log.info("existe");
				}else
				{
		        newRequest = request.newBuilder()
		                .addHeader("unique_id", UUID.randomUUID().toString())
		                .build();
				}
		        
				log.info("Intercepted headers: {} from URL: {}", newRequest.headers(), request.url());
				
				if (null != request.body())
					log.info("Intercepted payload: {} from URL: {}", request.body(),request.url());
				
			} catch (Exception e) {
				log.error("Interceptor loggin failed {}", e);
			}
			
			return chain.proceed(newRequest!= null? newRequest:request);
			
		}
		return null;
		
	}

}
