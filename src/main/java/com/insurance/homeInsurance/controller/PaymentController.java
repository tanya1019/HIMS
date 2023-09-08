package com.insurance.homeInsurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.homeInsurance.entity.Payment;
import com.insurance.homeInsurance.exception.CustomerException;
import com.insurance.homeInsurance.exception.OwnedPolicyException;
import com.insurance.homeInsurance.service.PaymentService;

@RestController
public class PaymentController {

	@Autowired
	PaymentService paymentService;
	
	
	@PostMapping("/payment/{ownedPolicyId}/{custId}")
	public Payment addPayment(@RequestBody Payment newPayment, @PathVariable("ownedPolicyId") Integer ownedPolicyId, @PathVariable("custId") Integer custId) throws OwnedPolicyException, CustomerException {
		return this.paymentService.createPaymentByOwnedPolicyId(newPayment, ownedPolicyId, custId);
	}
	
}
