package com.java.spr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmpDetails {
	
	@Value("#{emp.empno}")
	private int empno;
	
	@Value("#{emp.name}")
	private String name;
	
	@Value("#{emp.basic}")
	private double basic;
	
	public void showInfo() {
		System.out.println("Empno "+empno);
		System.out.println("Name "+name);
		System.out.println("Basic "+basic);
	}
}
