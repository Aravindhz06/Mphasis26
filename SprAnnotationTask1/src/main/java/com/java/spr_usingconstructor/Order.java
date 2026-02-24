package com.java.spr_usingconstructor;

public class Order {
	
	private int qtyord,orderid;
	private Product objproduct;
	
	
	
	public Order(int qtyord, int orderid, Product objproduct) {
		super();
		this.qtyord = qtyord;
		this.orderid = orderid;
		this.objproduct = objproduct;
	}
	
	
	public Order() {}


	public int getQtyord() {
		return qtyord;
	}
	public void setQtyord(int qtyord) {
		this.qtyord = qtyord;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public Product getObjproduct() {
		return objproduct;
	}
	public void setObjproduct(Product objproduct) {
		this.objproduct = objproduct;
	}
	public void display(){
		System.out.println("Quantity ordered : "+qtyord+", Order ID : "+orderid);
		objproduct.product();
	}

}