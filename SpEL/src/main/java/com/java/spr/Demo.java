package com.java.spr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{'Good Morning....'}")
	private String message;
	
	@Value("#{'Mphasis'}")
	private String company;
	
	@Value("#{10+20}")
	private int result;
	
	@Value("#{10>5}")
	public boolean flag;

	public String getMessage() {
		return message;
	}

	public String getCompany() {
		return company;
	}

	public int getResult() {
		return result;
	}

	public boolean isFlag() {
		return flag;
	}
	
	
	
}
