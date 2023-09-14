package com.insurance.homeInsurance.service;

import java.util.Collection;
import java.util.List;

import com.insurance.homeInsurance.entity.Claim;
import com.insurance.homeInsurance.exception.ClaimException;
import com.insurance.homeInsurance.exception.CustomerException;
import com.insurance.homeInsurance.exception.OwnedPolicyException;
import com.insurance.homeInsurance.exception.PropertyException;

public interface ClaimService {

	Collection<Claim> getAllClaim();
	Claim createClaimByPolicyIdAndCustomerId(Claim newClaim,Integer polId, Integer custId) throws ClaimException, PropertyException, OwnedPolicyException, CustomerException;

	Claim getClaimByPolicyIdAndPropertyId(Integer custId, Integer propId, Integer claimId) throws ClaimException,PropertyException,OwnedPolicyException;
	
	Claim updateClaim(Integer id) throws ClaimException;
	List<Claim> getClaimByCustomerId(Integer id) throws CustomerException;

	 
}
