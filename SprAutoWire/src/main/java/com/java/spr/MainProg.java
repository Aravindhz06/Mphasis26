
package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = new 
	ClassPathXmlApplicationContext("com/java/spr/person.xml");
		Person person1 = (Person)ctx.getBean("personShashank");
		person1.showAllInfo();
		System.out.println();
		Person person2 = (Person)ctx.getBean("personAakash");
		person2.showAllInfo();
		System.out.println();
		Person person3 = (Person)ctx.getBean("personVarshini");
		person3.showAllInfo();
	}
}
