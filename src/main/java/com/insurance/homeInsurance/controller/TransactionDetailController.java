package com.insurance.homeInsurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.homeInsurance.entity.TransactionDetails;
import com.insurance.homeInsurance.service.TransactionDetailService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TransactionDetailController {
	
	@Autowired
	TransactionDetailService transactionDetailService;

	@GetMapping("/createtransaction/{amount}")
	public TransactionDetails createTransaction(@PathVariable("amount") Double amount) {
		
		return transactionDetailService.createTransaction(amount);
		
	}
}
