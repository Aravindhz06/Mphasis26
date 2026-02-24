package com.java.spr_withoutusingconstructor;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	
	
	@Bean
	public OrderLogic order1() {
		Product p=new Product();
		p.setProduct("Mobile");
		p.setQuantityavail(4);
		p.setPrice(35000);
		Order o=new Order();
		o.setQtyord(3);
		o.setOrderid(1);
		o.setObjproduct(p);
		OrderLogic ol=new OrderLogic();
		ol.setItems(Arrays.asList(o));
		return ol;
	}
}
