package com.jsp.controller;

import com.jsp.productcustomer.dto.Customer;
import com.jsp.service.CustomerService;

public class CustomerDriver {
	
	public static void main(String[] args) {
		Customer customer =new Customer();
		customer.setName("Ronald");
		customer.setEmail("ronald@gmail.com");
		customer.setBill("paid");
		
		
		CustomerService customerService=new CustomerService();
		Customer customer2 = customerService.saveCustomer(customer);
		if(customer2!=null) {
			System.out.println(customer2.getId()+"saved succesfully");
		
		}

}
}