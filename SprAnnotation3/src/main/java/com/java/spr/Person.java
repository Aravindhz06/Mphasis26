package com.java.spr;

public class Person {

	private int id;
	private String name;
	private JobDetails jobDetails;
	private Family family;
	
	public void showInfo() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Job: "+jobDetails);
		System.out.println("Family: "+family);
		System.out.println("--------------------------------------------------");
	}

	public Person(int id, String name, JobDetails jobDetails, Family family) {
		this.id = id;
		this.name = name;
		this.jobDetails = jobDetails;
		this.family = family;
	}

	public Person() {}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", jobDetails=" + jobDetails + ", family=" + family + "]";
	}
		
	
}
