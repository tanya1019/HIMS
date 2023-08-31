package com.insurance.homeInsurance.controller;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.insurance.homeInsurance.dto.loginDto;
import com.insurance.homeInsurance.entity.Customer;
import com.insurance.homeInsurance.exception.CustomerException;
import com.insurance.homeInsurance.service.CustomerService;


@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	

		 
	 
	
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer newCustomer) throws CustomerException {
		
		try {
			
			return this.customerService.addCustomer(newCustomer);
		}catch (CustomerException e) {
			throw e;
		}
		
	}
	
	@GetMapping("/getAllCustomer")
	public Collection<Customer> getAllCustomer() {
		return this.customerService.getAllCustomer();
	}
	
	
	@PutMapping("/customer/update/{id}")
	 public Customer updateCustomer(@RequestBody Customer newCustomer)throws CustomerException {

		try {
			return this.customerService.updateCustomerUsingId(newCustomer);	 
		}catch (CustomerException e) {
			throw e;
		}

	 }

	 

	 @GetMapping("/customer/{id}")
	 public Customer getCustomerById(@PathVariable("id") Integer id) throws CustomerException {

		 try{
			 return this.customerService.getCustomerById(id);
		}catch (CustomerException e) {
				throw e;
		} 
	 }
	 
	 
	 @PostMapping("/login")
	 public Customer login(@RequestBody loginDto login) throws CustomerException {
 
		 return this.customerService.login(login);
	 }
	
	 
	   
	
	
	
}
