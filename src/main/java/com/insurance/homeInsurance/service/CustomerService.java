package com.insurance.homeInsurance.service;

import java.util.Collection;


import com.insurance.homeInsurance.entity.Customer;
import com.insurance.homeInsurance.exception.CustomerException;

public interface CustomerService {
	
	Customer addCustomer(Customer newCustomer) throws CustomerException ;
	Customer updateCustomer(Customer newCustomer) throws CustomerException;
	Collection<Customer> getAllCustomer();
	
	Customer updateCustomerUsingId(Customer customer) throws CustomerException;
	Customer getCustomerById(Integer id)throws CustomerException;
	
}
