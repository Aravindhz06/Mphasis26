package com.java.spr_withoutusingconstructor;

import java.util.List;

import com.java.spr_usingconstructor.Student;

public class Faculty {
	private String fname;
	private List students;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public List getStudents() {
		return students;
	}
	public void setStudents(List students) {
		this.students = students;
	}
	
	public Faculty() {
	}
	public void teaching(){
		System.out.println(("Faculty: ")+fname+", Sharing lunch with Students! ");
		for(int i=0;i<students.size();i++){
			Student s=(Student)students.get(i);
			s.display();
		}
	}
}

