package com.java.spr_withoutusingconstructor;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	
	@Bean
	public Faculty faculty1() {
		LunchBox l=new LunchBox();
		l.setSnacks("Chips");
		Student s=new Student();
		s.setSno(1);
		s.setName("Aravindh");
		s.setLunchbox(l);
		Faculty f=new Faculty();
		f.setFname("dhoni");
		f.setStudents(Arrays.asList(s));
		return f;
	}
}
