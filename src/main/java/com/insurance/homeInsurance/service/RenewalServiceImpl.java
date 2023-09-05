package com.insurance.homeInsurance.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.homeInsurance.dao.OwnedPolicyRepository;
import com.insurance.homeInsurance.dao.RenewalRepository;

@Service
public class RenewalServiceImpl implements RenewalService{

	@Autowired
	private OwnedPolicyRepository ownedPolicyRepo;
	
	@Autowired
	private RenewalRepository renewalRepo;
	
	

}
