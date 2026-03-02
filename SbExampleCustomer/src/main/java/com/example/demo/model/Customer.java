package com.example.demo.model;

public class Customer {

	private int custId;
	private String customerName;
	private String city;
	private String mobileNo;
	private double billAmount;
	
	public Customer(int custId, String customerName, String city, String mobileNo, double billAmount) {

		this.custId = custId;
		this.customerName = customerName;
		this.city = city;
		this.mobileNo = mobileNo;
		this.billAmount = billAmount;
	}

	public Customer() {

		// TODO Auto-generated constructor stub
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	
	
}
