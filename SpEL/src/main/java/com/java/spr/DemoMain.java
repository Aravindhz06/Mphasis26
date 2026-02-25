package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {
	public static void main(String[] args) {
		ApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		Demo demo=ctx.getBean(Demo.class);
		System.out.println(demo.getCompany());
		System.out.println(demo.getMessage());
		System.out.println(demo.getResult());
		System.out.println(demo.isFlag());
	}
}
