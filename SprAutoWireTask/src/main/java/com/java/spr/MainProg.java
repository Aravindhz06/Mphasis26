package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("com/java/spr/orderdetails.xml");
		OrderDetails od=(OrderDetails)ctx.getBean("orderDetails");
		od.showAllInfo();
		
		System.out.println();
		
		OrderDetails od1=(OrderDetails)ctx.getBean("orderDetails1");
		od1.showAllInfo();
	}
	
}
