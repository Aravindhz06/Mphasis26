package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployShowMain {
	public static void main(String[] args) {
		  ApplicationContext context =
	                new AnnotationConfigApplicationContext(AppConfig.class);

	        EmployDaoImpl dao = context.getBean(EmployDaoImpl.class);
	        dao.showEmploy().forEach(System.out::println);
	}
}
