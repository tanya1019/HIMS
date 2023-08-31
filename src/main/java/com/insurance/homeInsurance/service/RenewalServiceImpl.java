package com.insurance.homeInsurance.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.homeInsurance.dao.OwnedPolicyRepository;
import com.insurance.homeInsurance.dao.RenewalRepository;

@Service
public class RenewalServiceImpl implements RenewalService{

	@Autowired
	OwnedPolicyRepository ownedPolicyRepo;
	
	@Autowired
	RenewalRepository renewalRepo;
	
	
	@Override
	public void setRenewalDate(LocalDate date) {
	}

}
