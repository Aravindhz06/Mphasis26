package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg2 {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/java/spr/person.xml");
		Person p1=(Person)ctx.getBean("personRupesh");
		p1.showAllInfo();
		System.out.println();
		Person p2=(Person)ctx.getBean("personAravindh");
		p2.showAllInfo();
		System.out.println();
		Person p3=(Person)ctx.getBean("personDhoni");
		p3.showAllInfo();
	}
}
