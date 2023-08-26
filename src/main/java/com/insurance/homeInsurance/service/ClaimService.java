package com.insurance.homeInsurance.service;

import java.util.Collection;

import com.insurance.homeInsurance.entity.Claim;
import com.insurance.homeInsurance.exception.ClaimException;

public interface ClaimService {

	
	Claim addClaim(Claim newClaim) throws ClaimException ;
	Claim updateClaim(Claim newClaim);
	Collection<Claim> getAllClaim();
}
