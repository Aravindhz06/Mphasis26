package com.java.spr;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmploySearchMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employ Number  ");
		empno=sc.nextInt();
		 ApplicationContext context =
	                new AnnotationConfigApplicationContext(AppConfig.class);

	        EmployDaoImpl employDao = context.getBean(EmployDaoImpl.class);
		Employ employ=employDao.searchEmploy(empno);
		if(employ!=null) {
			System.out.println(employ);
		}else {
			System.out.println("*** Employ Record Not Found ***");
		}
	}
}
