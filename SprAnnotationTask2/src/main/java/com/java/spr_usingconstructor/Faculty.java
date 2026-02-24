package com.java.spr_usingconstructor;

import java.util.List;

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
	
	public Faculty(String fname, List students) {
		this.fname = fname;
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
