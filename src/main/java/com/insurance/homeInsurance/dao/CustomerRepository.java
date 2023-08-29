package com.insurance.homeInsurance.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.homeInsurance.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	Optional<Customer> findByEmail(String email);
}
