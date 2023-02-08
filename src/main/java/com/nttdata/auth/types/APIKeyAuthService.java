package com.nttdata.auth.types;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.nttdata.config.AuthProperties;
import com.nttdata.config.BeanUtil;

public class APIKeyAuthService {
	
	@Autowired
	private AuthProperties authProperties;
	
	@PostConstruct
	private void init() {
		authProperties = (AuthProperties) BeanUtil.getConfig("authProperties");
	}
	
	public APIKeyCredential getAPIKey(String target) {
		if(authProperties == null) {
			init();
		}
		return authProperties.getAPIKeys().get(target);
	
	}

}
