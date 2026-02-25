package com.java.spr;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeleteEmployMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employ Number  ");
		empno=sc.nextInt();
		ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
    EmployDaoImpl employDao = context.getBean(EmployDaoImpl.class);
		System.out.println(employDao.deleteEmploy(empno));
	}
}
