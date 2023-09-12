package com.insurance.homeInsurance.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.homeInsurance.entity.Claim;

import com.insurance.homeInsurance.exception.ClaimException;

import com.insurance.homeInsurance.exception.OwnedPolicyException;
import com.insurance.homeInsurance.exception.PropertyException;
import com.insurance.homeInsurance.service.ClaimService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClaimController {
	
	@Autowired
	ClaimService claimService;
	
	@PostMapping("/claim/{policyId}/{propertyId}")
	public Claim createClaimByPolicyIdAndPropertyId(@RequestBody Claim newClaim, @PathVariable("propId") Integer PropId, @PathVariable("polId") Integer PolId) throws ClaimException, PropertyException, OwnedPolicyException {
		
		try {
			return this.claimService.createClaimByPolicyIdAndPropertyId(newClaim,PropId,PolId);
		}catch (ClaimException e) {
			throw e;
		}	
	}
	
	@GetMapping("/claims")
	public Collection<Claim> getAllClaim() {
		return this.claimService.getAllClaim();
	}
//	getClaimByPolicyId
//	getClaimByCustomerId
//	getAllClaimsByCustomerId
	
	
	
	@SuppressWarnings("unchecked")
	@GetMapping("/claim/{propId}/{polId}")
	public Collection<Claim> getClaimByPolicyIdAndCustomerId(@PathVariable("claimId") Integer ClaimId ,@PathVariable("propId") Integer PropId, @PathVariable("polId") Integer PolId) throws ClaimException, PropertyException, OwnedPolicyException {
		
		return (Collection<Claim>) this.claimService.getClaimByPolicyIdAndPropertyId(PropId,PolId, ClaimId);
		
		
	}
	
}
