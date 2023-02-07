package com.nttdata.auth.types;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.nttdata.config.AuthProperties;
import com.nttdata.config.BeanUtil;

import okhttp3.Credentials;

public class BasicAuthService {
	
	
	
	@Autowired
	private AuthProperties authProperties;
	
	@PostConstruct
	private void init() {
		authProperties = (AuthProperties) BeanUtil.getConfig("authProperties");
	}
	
	public String getCredentials(String target) {
		if(authProperties == null) {
			init();
		}
		Credential credential = authProperties.getCredentials().get(target);
		return Credentials.basic(credential.getUsername(), credential.getPassword());
	}
	

}
