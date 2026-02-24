package com.java.spr_usingconstructor;

import java.util.*;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	
	
	@Bean
	public LunchBox lunch1() {
		return new LunchBox("Chips");
	}
	
	@Bean
	public Student student1() {
		return new Student(1,"Aravindh",lunch1());
	}
	
	@Bean
	public Faculty faculty() {
		return new Faculty("dhoni",Arrays.asList(student1()));
	}
}
