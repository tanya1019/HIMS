package com.insurance.homeInsurance.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.homeInsurance.dao.ClaimRepository;

import com.insurance.homeInsurance.dao.OwnedPolicyRepository;
import com.insurance.homeInsurance.dao.PropertyRepository;
import com.insurance.homeInsurance.entity.Claim;

import com.insurance.homeInsurance.entity.OwnedPolicy;
import com.insurance.homeInsurance.entity.Property;
import com.insurance.homeInsurance.exception.ClaimException;

import com.insurance.homeInsurance.exception.OwnedPolicyException;
import com.insurance.homeInsurance.exception.PropertyException;


@Service
public class ClaimServiceImpl implements ClaimService{
	
	@Autowired
	private ClaimRepository claimRepo;
	
	@Autowired
	private PropertyRepository propertyRepo;
	
	@Autowired
	private OwnedPolicyRepository ownedPolicyRepo;

	@Override
	public Claim createClaimByPolicyIdAndPropertyId(Claim newClaim, Integer propId, Integer polId) throws ClaimException,PropertyException,OwnedPolicyException {
		
		//get property and ownedPolicy data:
		Optional<Property> propOpt = this.propertyRepo.findById(propId);
		Optional<OwnedPolicy> polOpt = this.ownedPolicyRepo.findById(polId);
		
		//check property is null or not
		 if(!propOpt.isPresent()) {
		 throw new PropertyException("Property not found" +propId);
		 }
		 //get property details:
		 Property property = propOpt.get();
		 
		//check policy is null or not
		 if(!polOpt.isPresent()) {
			 throw new OwnedPolicyException("Policy not found" +polId);
			 }
		//get ownedPolicy details:
		 OwnedPolicy ownedPolicy = polOpt.get();
		 
		 //set property to the new claim
		 newClaim.setPropertyDetails(property);
		 
		//set policy to the new claim
		 newClaim.setOwnedPolicyDetails(ownedPolicy);
		 
		 Claim claim = this.claimRepo.save(newClaim) ;
		 
		 //set claim in property:
		 property.setClaim(claim);
		 return claim;
	}

	@Override
	public Claim getClaimByPolicyIdAndPropertyId(Integer custId, Integer propId, Integer claimId) throws ClaimException,PropertyException,OwnedPolicyException {
		Optional<Property> propOpt = this.propertyRepo.findById(propId);
		 if (!propOpt.isPresent()) {
		 throw new PropertyException("Property not found" + propId);
		 }
		 Property property = propOpt.get();
		 
		Optional<OwnedPolicy> opolOpt = this.ownedPolicyRepo.findById(propId);
		 if (!opolOpt.isPresent()) {
		 throw new OwnedPolicyException("owned Policy not found" + propId);
		 }
		 OwnedPolicy ownedPolicy = opolOpt.get();
		 
		 
		Optional<Claim> claimOpt = this.claimRepo.findById(claimId);
		 if (!claimOpt.isPresent()) {
		 throw new ClaimException("Claim not found" + claimOpt);
		 }
		 Claim claim = claimOpt.get();
		 
		 if ((property.getClaim(claim).equals(claim)) && (ownedPolicy.getClaim(claim).equals(claim)));
		 return claim;
		 
		 
	}

	@Override
	public Collection<Claim> getAllClaims() {
		return this.claimRepo.findAll();
	}
	
	
	

}
