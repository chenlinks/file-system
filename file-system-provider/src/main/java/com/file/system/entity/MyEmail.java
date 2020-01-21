package com.file.system.entity;

import lombok.Data;

@Data
public class MyEmail {

	private String fromEmail;
	
	private String fromPwd;
	
	private String toEmail;
	
	private String eTitle;
	
	private String eBody;
	
	private String messageType;

}
