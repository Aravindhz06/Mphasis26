package com.java.spr;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	
	@Bean
	public Student student1() {
		return new Student(1,"Aravindh","Ramesh");
	}
	@Bean
	public Trainer trainer1() {
		return new Trainer("prasanna","Chennai",Arrays.asList(student1()));
	}
}
