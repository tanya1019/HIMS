package com.insurance.homeInsurance.service;

import java.util.Collection;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.insurance.homeInsurance.dao.CustomerRepository;
import com.insurance.homeInsurance.dto.loginDto;
import com.insurance.homeInsurance.entity.Customer;
import com.insurance.homeInsurance.exception.CustomerException;


@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepo;

	@Override
	public Customer addCustomer(Customer newCustomer) throws CustomerException {
	Optional<Customer> customerOpt = this.customerRepo.findByEmail(newCustomer.getEmail());
	if(customerOpt.isPresent()) {
		throw new CustomerException("Email id already exist");
	}
	
	BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	newCustomer.setPassword(passwordEncoder.encode(newCustomer.getPassword()));
	return this.customerRepo.save(newCustomer);
	}

	
	@Override
	public Customer updateCustomer(Customer newCustomer) throws CustomerException {
		
		Optional<Customer> customerOpt = this.customerRepo.findById(newCustomer.getId());
		
		if(!customerOpt.isPresent()) {
			throw new CustomerException("Product not found of id --> " + newCustomer.getId());
		}
		return this.customerRepo.save(newCustomer);
	}

	@Override
	public Collection<Customer> getAllCustomers() {
		//created by Anish
		//get all features 
		
		return this.customerRepo.findAll();
	}

	@Override
	public Customer updateCustomerUsingId(Customer customer) throws CustomerException {
		//Created by Soniya
			return this.customerRepo.save(customer);
		
	}

	@Override
	public Customer getCustomerById(Integer id) throws CustomerException {
		//Created by Soniya
		Optional<Customer>customerOpt = this.customerRepo.findById(id);
		if(!customerOpt.isPresent())
			throw new CustomerException("Customer Not Found for id: "+id);
		return customerOpt.get();
	}



	@Override
	public Customer login(loginDto login) throws CustomerException {
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		
		Optional<Customer>customerOpt =this.customerRepo.findByEmail(login.getEmail());
		
		if(!customerOpt.isPresent()) {
			throw new CustomerException("User not found");	
		}
		
		Customer customer = customerOpt.get();
		System.out.println(customer);
		
		if(!passwordEncoder.matches(login.getPassword(), customer.getPassword())) {
			throw new CustomerException("Invalid password");
		}

		return customer;
		
	}

	
}
