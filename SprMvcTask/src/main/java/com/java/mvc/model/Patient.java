package com.java.mvc.model;

public class Patient {
	
	private int patientId;
	private String patientName;
	private String gender;
	private double billAmount;
	private String city;
	private String state;
	private String policyNumber;
	private double claimAmount;
	private String insuranceName;
	private double pendingAmount;
	
	public Patient(int patientId, String patientName, String gender, double billAmount, String city, String state,
			String policyNumber, double claimAmount, String insuranceName, double pendingAmount) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.gender = gender;
		this.billAmount = billAmount;
		this.city = city;
		this.state = state;
		this.policyNumber = policyNumber;
		this.claimAmount = claimAmount;
		this.insuranceName = insuranceName;
		this.pendingAmount = pendingAmount;
	}

	public Patient() {}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public double getClaimAmount() {
		return claimAmount;
	}

	public void setClaimAmount(double claimAmount) {
		this.claimAmount = claimAmount;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public double getPendingAmount() {
		return pendingAmount;
	}

	public void setPendingAmount(double pendingAmount) {
		this.pendingAmount = pendingAmount;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", gender=" + gender
				+ ", billAmount=" + billAmount + ", city=" + city + ", state=" + state + ", policyNumber="
				+ policyNumber + ", claimAmount=" + claimAmount + ", insuranceName=" + insuranceName
				+ ", pendingAmount=" + pendingAmount + "]";
	}
	
}
