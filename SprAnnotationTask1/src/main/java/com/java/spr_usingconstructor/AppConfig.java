package com.java.spr_usingconstructor;

import java.util.*;

import org.springframework.context.annotation.Bean;

public class AppConfig {

	@Bean
	public Product product1() {
		return new Product("Mobile",5,35000);
	}
	@Bean
	public Product product2() {
		return new Product("Mobile",6,75000);
	}
	
	@Bean
	public Order order1() {
		return new Order(1,3,product1());
	}
	@Bean
	public Order order2() {
		return new Order(4,1,product2());
	}
	
	@Bean
	public OrderLogic ologic() {
		return new OrderLogic(Arrays.asList(order1(),order2()));
	}
	
}
