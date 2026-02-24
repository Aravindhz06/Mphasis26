package com.java.spr_withoutusingconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProg {
	
	public static void main(String[] args) {
		ApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
	    Faculty f=(Faculty)ctx.getBean("faculty1");
	    f.teaching();
	}
}
