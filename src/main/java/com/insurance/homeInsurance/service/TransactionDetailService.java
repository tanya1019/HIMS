package com.insurance.homeInsurance.service;

import com.insurance.homeInsurance.entity.TransactionDetails;
import com.razorpay.Order;

public interface TransactionDetailService {

TransactionDetails createTransaction(Double amount);
	
	TransactionDetails prepareTransactionDetails(Order order);
}
