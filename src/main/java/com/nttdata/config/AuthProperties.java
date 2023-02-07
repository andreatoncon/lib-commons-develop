package com.nttdata.config;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.nttdata.auth.types.APIKeyCredential;
import com.nttdata.auth.types.ClientCredential;
import com.nttdata.auth.types.Credential;

import lombok.Data;

@ConfigurationProperties(prefix = "com.nttdata.auth")
@Data
@Component
public class AuthProperties {

	private Map<String, Credential> credentials;
	private Map<String, ClientCredential> clientCredential;
	private Map<String, APIKeyCredential> APIKeys;
	private Map<String, String> authType;
	

	
	

}
