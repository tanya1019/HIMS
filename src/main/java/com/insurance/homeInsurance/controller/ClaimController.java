package com.insurance.homeInsurance.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.homeInsurance.entity.Claim;
import com.insurance.homeInsurance.entity.Feature;
import com.insurance.homeInsurance.exception.ClaimException;
import com.insurance.homeInsurance.exception.CustomerException;
import com.insurance.homeInsurance.exception.FeatureException;
import com.insurance.homeInsurance.exception.OwnedPolicyException;
import com.insurance.homeInsurance.exception.PropertyException;
import com.insurance.homeInsurance.service.ClaimService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClaimController {
	
	@Autowired
	ClaimService claimService;
	
	@PostMapping("/claim/{policyId}/{custid}")
	public Claim createClaimByPolicyIdAndPropertyId(@RequestBody Claim newClaim, @PathVariable("policyId") Integer policyId, @PathVariable("custid") Integer custid) throws ClaimException, PropertyException, OwnedPolicyException, CustomerException {
		try {
			return this.claimService.createClaimByPolicyIdAndCustomerId(newClaim,policyId, custid);
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
	public Collection<Claim> getClaimByPolicyIdAndCustomerId(@PathVariable("claimId") Integer ClaimId ,@PathVariable("propId") Integer PropId, @PathVariable("polId") Integer PolId) throws ClaimException, OwnedPolicyException, PropertyException {
		
		return (Collection<Claim>) this.claimService.getClaimByPolicyIdAndPropertyId(PropId,PolId, ClaimId);
		
		
	}
	
	
	@PutMapping("/claim/approve/{id}")
    public Claim updateFeatureById(@PathVariable("id") Integer id ) throws ClaimException {
        return this.claimService.updateClaim(id);     

    }
	
	@GetMapping("/claim/{custId}")
	public List<Claim> getClaimByCustomerId(@PathVariable("custId") Integer custId ) throws CustomerException {
		return this.claimService.getClaimByCustomerId(custId);
	}
//	
}
