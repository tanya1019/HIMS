package com.insurance.homeInsurance.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.homeInsurance.entity.Claim;
import com.insurance.homeInsurance.exception.ClaimException;
import com.insurance.homeInsurance.service.ClaimService;


@RestController
public class ClaimController {
	
	@Autowired
	ClaimService claimService;
	
	@PostMapping("/claim")
	public Claim addClaim(@RequestBody Claim newClaim) throws ClaimException {
		
		try {
			return this.claimService.addClaim(newClaim);
		}catch (ClaimException e) {
			throw e;
		}

		
		
	}
	
	@GetMapping("/getAllClaim")
	public Collection<Claim> getAllClaim() {
		return this.claimService.getAllClaim();
	}
	

}
