package com.insurance.homeInsurance.service;

import java.util.Collection;

import com.insurance.homeInsurance.entity.Claim;
import com.insurance.homeInsurance.exception.ClaimException;
import com.insurance.homeInsurance.exception.CustomerException;

public interface ClaimService {

	Collection<Claim> getAllClaim();
	Claim createClaimByPolicyIdAndPropertyId(Claim newClaim, Integer propId, Integer polId) throws ClaimException, CustomerException;

	Claim getClaimByPolicyIdAndPropertyId(Integer custId, Integer propId, Integer claimId) throws CustomerException;
}
