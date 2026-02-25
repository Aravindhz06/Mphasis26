package com.java.spr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Emp {
	
	@Value("#{100}")
	private int empno;
	
	@Value("#{'Srini'}")
	private String name;
	
	@Value("#{875772.44}")
	private double basic;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	
}
