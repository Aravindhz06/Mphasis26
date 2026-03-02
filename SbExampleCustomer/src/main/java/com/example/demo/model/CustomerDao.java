package com.example.demo.model;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class CustomerDao {

	private static List<Customer> customerList=
			new ArrayList<>(Arrays.asList(
					new Customer(1, "Aravindh", "Chennai", "9384949592", 2355.33),
					new Customer(2, "Priya", "Bangalore", "9876543210", 4500.75),
					new Customer(3, "Karthik", "Hyderabad", "9123456780", 1899.00),
					new Customer(4, "Sanjay", "Mumbai", "9012345678", 7520.40),
					new Customer(5, "Divya", "Coimbatore", "9098765432", 320.99)	
					));
	
	 public String addCustomer(Customer customer) {
			customerList.add(customer);
			return "Customer Record Inserted...";
		}
	 
	 public String deleteCustomer(int custId) {
		 Customer customerFound=searchCustomer(custId);
		 if(customerFound!=null) {
			 customerList.remove(custId);
			 return "Customer Record Deleted...";
		 }
		 return "Customer Id not found...";
	 }
	 
	 public String updateEmploy(Customer customer) {
			Customer customerFound = searchCustomer(customer.getCustId());
			if (customerFound !=null) {
				customerFound.setCustomerName(customer.getCustomerName());
				customerFound.setCity(customer.getCity());
				customerFound.setMobileNo(customer.getMobileNo());
				customerFound.setBillAmount(customer.getBillAmount());
				return "Customer Record Updated...";
			}
			return "Customer Record Not Exists...";
		}
	 
	 public Customer searchCustomer(int custId) {
			return customerList.stream()
			        .filter(e -> e.getCustId() == custId)
			        .findFirst()
			        .orElse(null);
		}
	 
	 public List<Customer> showCustomer(){
		 return customerList;
	 }
		
}
