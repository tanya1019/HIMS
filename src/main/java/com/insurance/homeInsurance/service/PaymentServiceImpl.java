package com.insurance.homeInsurance.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.homeInsurance.dao.CustomerRepository;
import com.insurance.homeInsurance.dao.OwnedPolicyRepository;
import com.insurance.homeInsurance.dao.PaymentRepository;
import com.insurance.homeInsurance.entity.Customer;
import com.insurance.homeInsurance.entity.OwnedPolicy;
import com.insurance.homeInsurance.entity.Payment;
import com.insurance.homeInsurance.exception.CustomerException;
import com.insurance.homeInsurance.exception.OwnedPolicyException;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepo;
	
	@Autowired
	private OwnedPolicyRepository ownedPolicyRepo;
	
	@Autowired
	private CustomerRepository customerRepo;
	

	@Override
	public Payment createPaymentByOwnedPolicyId(Payment newPayment, Integer ownedPolicyId, Integer custId) throws OwnedPolicyException, CustomerException {
		
		Optional<OwnedPolicy> ownedPolicyOpt = ownedPolicyRepo.findById(ownedPolicyId);
		Optional<Customer> customerOpt = customerRepo.findById(custId);
		
		if(!customerOpt.isPresent()) {
			throw new CustomerException("Customer not present");
		}
		if(!ownedPolicyOpt.isPresent()) {
			throw new OwnedPolicyException("Policy not present");
		}
		
		Customer customer = customerOpt.get();
		newPayment.setCustomerDeatails(customer);

		OwnedPolicy ownedPolicy = ownedPolicyOpt.get();
		ownedPolicy.setPaymentDetails(newPayment);
		
		newPayment.setOwnedPolicyDetail(ownedPolicy);
		
		return this.paymentRepo.save(newPayment);

	}

}
