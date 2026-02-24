package com.java.spr;

public class Family {

	private String city;
	private String state;
	
	public Family(String city, String state) {

		this.city = city;
		this.state = state;
	}

	public Family() {
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Family [city=" + city + ", state=" + state + "]";
	}
	
	
}
