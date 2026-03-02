package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.model.CustomerDao;


@RestController
@RequestMapping(value="/customer")
public class CustomerController {

	@Autowired
	private CustomerDao customerDao;
	
	@GetMapping(value="/showcustomer")
	public List<Customer> showCustomer(){
		return customerDao.showCustomer();
	}
	
	@GetMapping(value="/searchcustomer/{custId}")
	public Customer searchCustomer(@PathVariable int custId) {
		return customerDao.searchCustomer(custId);
	}
	
	@PostMapping(value="/addcustomer")
	public String addCustomer(@RequestBody Customer customer) {
		return customerDao.addCustomer(customer);
	}
	
	@PutMapping(value="/updatecustomer")
	public String updateCustomer(@RequestBody Customer customer) {
		return customerDao.updateEmploy(customer);
	}
	
	@DeleteMapping(value="/deletecustomer/{custId}")
	public String deleteCustomer(@PathVariable int custId) {
		return customerDao.deleteCustomer(custId);
	}
}
