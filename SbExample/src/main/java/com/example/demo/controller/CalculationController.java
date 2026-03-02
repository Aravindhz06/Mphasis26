package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/calc")
public class CalculationController {

	@GetMapping(value="/sum/{a}/{b}")
	public String sum(@PathVariable int a, @PathVariable int b) {
		int c=a+b;
		String res="";
		res+=c;
		return res;
	}
	
	@GetMapping(value="/sub/{a}/{b}")
	public String sub(@PathVariable int a, @PathVariable int b) {
		int c=a-b;
		String res="";
		res+=c;
		return res;
	}
	
	@GetMapping(value="/mul/{a}/{b}")
	public String mul(@PathVariable int a, @PathVariable int b) {
		int c=a*b;
		String res="";
		res+=c;
		return res;
	}
	
	@GetMapping(value="/div/{a}/{b}")
	public String div(@PathVariable int a, @PathVariable int b) {
		double c=(double)a/b;
		String res="";
		res+=c;
		return res;
	}
}
