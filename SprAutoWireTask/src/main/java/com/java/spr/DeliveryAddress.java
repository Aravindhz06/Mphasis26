package com.java.spr;

public class DeliveryAddress {
	
	private int addressId;
	private String city;
	private String zipCode;
	private long mobileNo;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "DeliveryAddress [addressId=" + addressId + ", city=" + city + ", zipCode=" + zipCode + ", mobileNo="
				+ mobileNo + "]";
	}
	
	
	
}
