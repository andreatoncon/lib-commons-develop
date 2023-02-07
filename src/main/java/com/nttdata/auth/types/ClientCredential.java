package com.nttdata.auth.types;

import lombok.Data;

@Data
public class ClientCredential {
	
	
	
	private String urlWellKnow;
	private String clientId;
	private String grantType;
	private String clientSecret;
	private String authType;
	private String scope;
	private String returnToken;

}
