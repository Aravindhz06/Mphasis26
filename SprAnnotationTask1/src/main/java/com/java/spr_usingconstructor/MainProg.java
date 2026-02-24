package com.java.spr_usingconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx=
					new AnnotationConfigApplicationContext(AppConfig.class);
		OrderLogic o1=ctx.getBean("ologic",OrderLogic.class);
		o1.display();
	}
}
