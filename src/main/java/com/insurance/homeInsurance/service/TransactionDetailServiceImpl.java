package com.insurance.homeInsurance.service;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.homeInsurance.dao.TransactionDetailRepository;
import com.insurance.homeInsurance.entity.TransactionDetails;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

@Service
public class TransactionDetailServiceImpl implements TransactionDetailService {
	
	@Autowired
	TransactionDetailRepository transactionDetailRepository;

	private static final String KEY = "rzp_test_5PKAzr82IrDbXJ";
	private static final String KEY_SECERET = "MNxmZpKZVtnCeiVMlHkYYNYQ";
	private static final String CURRENCY = "INR";
	
	
	@Override
	public TransactionDetails createTransaction(Double amount) {
		
		try {
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("amount", (amount*100));
			jsonObject.put("currency", CURRENCY);
			
			RazorpayClient razorpayClient = new RazorpayClient(KEY, KEY_SECERET);
			
			Order order =  razorpayClient.orders.create(jsonObject);
			TransactionDetails transactionDetail =  prepareTransactionDetails(order);
			return transactionDetail;
			
			
			
			
		} catch (RazorpayException e) {
			System.out.println(e.getMessage());
		}
		
		return null;
		
	}


	@Override
	public TransactionDetails prepareTransactionDetails(Order order) {
		
		String orderId = order.get("id");
		String currency = order.get("currency");
		Integer amount = order.get("amount");
		
		TransactionDetails transactionDetails = new TransactionDetails(orderId, currency, amount, KEY);
		return transactionDetails;
	}

}
