package com.insurance.homeInsurance.service;

import com.insurance.homeInsurance.entity.Payment;
import com.insurance.homeInsurance.exception.CustomerException;
import com.insurance.homeInsurance.exception.OwnedPolicyException;
import com.razorpay.Order;

public interface PaymentService {

	Payment createPaymentByOwnedPolicyId(Payment newPayment, Integer ownedPolicyId, Integer custId) throws OwnedPolicyException, CustomerException;

}
