package com.java.spr;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sun.util.calendar.LocalGregorianCalendar.Date;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/java/spr/hello.xml");
		HelloImpl impl=null;
		int hr=new Date().getHours();
		if(hr<=12) {
			impl=(HelloImpl) ctx.getBean("bean1");
		}
		else if(hr >12 && hr < 16) {
			impl=(HelloImpl) ctx.getBean("bean2");
		}
		else {
			impl=(HelloImpl) ctx.getBean("bean3");
		}
		System.out.println(impl.sayHello("Aravindh"));
	}
}
