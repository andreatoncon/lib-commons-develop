package com.nttdata.auth.types;

import lombok.Data;

@Data
public class APIKeyCredential {

	private String header;
	private String key;
}
