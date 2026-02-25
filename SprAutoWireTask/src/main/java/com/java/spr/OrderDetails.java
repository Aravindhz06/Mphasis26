package com.java.spr;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderDetails {

	private int orderId;
	private Customer customer;
	private DeliveryAddress deliveryAddress;
	@Autowired
	private Vendor vendor;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public DeliveryAddress getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", customer=" + customer + ", deliveryAddress=" + deliveryAddress
				+ ", vendor=" + vendor + "]";
	}
	
	public void showAllInfo() {
		System.out.println("Order ID: "+orderId);
		System.out.println("Customer Details: "+customer);
		System.out.println("Delivery Address: "+deliveryAddress);
		System.out.println("Vendor Details: "+vendor);
	}
	
}
