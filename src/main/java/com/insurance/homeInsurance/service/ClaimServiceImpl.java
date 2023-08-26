package com.insurance.homeInsurance.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.homeInsurance.dao.ClaimRepository;
import com.insurance.homeInsurance.dao.CustomerRepository;
import com.insurance.homeInsurance.dao.OwnedPolicyRepository;
import com.insurance.homeInsurance.entity.Claim;
import com.insurance.homeInsurance.exception.ClaimException;


@Service
public class ClaimServiceImpl implements ClaimService{
	
	@Autowired
	ClaimRepository claimRepo;
	
	@Autowired
	CustomerRepository customerRepo;
	
	@Autowired
	OwnedPolicyRepository ownedPolicyRepo;

	@Override
	public Claim addClaim(Claim newClaim) throws ClaimException {
		
		Optional<Claim> claimOpt = this.claimRepo.findById(newClaim.getId());
		
		if(claimOpt.isPresent()) 
			throw new ClaimException("Product Already Exist with claim id: " + (newClaim.getId()));
		return this.claimRepo.save(newClaim);
	}

	@Override
	public Claim updateClaim(Claim newClaim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Claim> getAllClaim() {
		
		return this.claimRepo.findAll();
	}
	
	
	

}
