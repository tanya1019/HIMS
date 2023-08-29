package com.insurance.homeInsurance.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.homeInsurance.entity.Claim;

import com.insurance.homeInsurance.exception.ClaimException;
import com.insurance.homeInsurance.exception.CustomerException;
import com.insurance.homeInsurance.service.ClaimService;


@RestController
public class ClaimController {
	
	@Autowired
	ClaimService claimService;
	
	@PostMapping("/createClaim/{policyId}/{propertyId}")
	public Claim createClaimByPolicyIdAndPropertyId(@RequestBody Claim newClaim, @PathVariable("propId") Integer PropId, @PathVariable("polId") Integer PolId) throws ClaimException, CustomerException {
		
		try {
			return this.claimService.createClaimByPolicyIdAndPropertyId(newClaim,PropId,PolId);
		}catch (ClaimException e) {
			throw e;
		}	
	}
	
	@GetMapping("/getAllClaim")
	public Collection<Claim> getAllClaim() {
		return this.claimService.getAllClaim();
	}
	
	
	@SuppressWarnings("unchecked")
	@GetMapping("/getClaim/{propId}/{polId}")
	public Collection<Claim> getClaimByPolicyIdAndCustomerId(@PathVariable("claimId") Integer ClaimId ,@PathVariable("propId") Integer PropId, @PathVariable("polId") Integer PolId) throws ClaimException, CustomerException {
		
		return (Collection<Claim>) this.claimService.getClaimByPolicyIdAndPropertyId(PropId,PolId, ClaimId);
		
		
	}
	
}
