package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpMain {
	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmpDetails obj=ctx.getBean(EmpDetails.class);
		obj.showInfo();
	}
}
