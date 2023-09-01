package com.insurance.homeInsurance.service;

import java.util.Collection;

import com.insurance.homeInsurance.entity.Claim;
import com.insurance.homeInsurance.exception.ClaimException;

import com.insurance.homeInsurance.exception.OwnedPolicyException;
import com.insurance.homeInsurance.exception.PropertyException;

public interface ClaimService {

	Collection<Claim> getAllClaim();
	Claim createClaimByPolicyIdAndPropertyId(Claim newClaim, Integer propId, Integer polId) throws ClaimException, PropertyException, OwnedPolicyException;

	Claim getClaimByPolicyIdAndPropertyId(Integer custId, Integer propId, Integer claimId) throws ClaimException,PropertyException,OwnedPolicyException;
}
