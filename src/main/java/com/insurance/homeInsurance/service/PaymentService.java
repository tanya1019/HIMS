package com.insurance.homeInsurance.service;

import com.insurance.homeInsurance.entity.Payment;
import com.insurance.homeInsurance.exception.CustomerException;
import com.insurance.homeInsurance.exception.OwnedPolicyException;

public interface PaymentService {

	Payment createPaymentByOwnedPolicyId(Payment newPayment, Integer ownedPolicyId, Integer custId) throws OwnedPolicyException, CustomerException;
	
}
