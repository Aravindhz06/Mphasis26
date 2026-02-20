package com.java.hib.dao;

import java.util.List;

import com.java.hib.model.Employ;

public interface EmployDao {
	
	List<Employ> showEmploy();
	Employ searchEmploy(int empno);
	String updateEmploy(Employ employ);
	String deleteEmploy(int empno);
	String addEmploy(Employ employ);
}