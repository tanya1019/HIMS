package com.insurance.homeInsurance.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.insurance.homeInsurance.exception.AdminException;
import com.insurance.homeInsurance.exception.CustomerException;

@RestControllerAdvice
public class RestFullControllerAdvice {

	@ExceptionHandler(CustomerException.class)
	public String handleCustomerExceptions(CustomerException e) {
		return e.getMessage();
	}
	
	@ExceptionHandler(AdminException.class)
	public String handleCustomerExceptions(AdminException e) {
		return e.getMessage();
	}
	
	
}
