package com.insurance.homeInsurance.service;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.homeInsurance.dao.ClaimRepository;
import com.insurance.homeInsurance.dao.CustomerRepository;
import com.insurance.homeInsurance.dao.OwnedPolicyRepository;
import com.insurance.homeInsurance.dao.PropertyRepository;
import com.insurance.homeInsurance.entity.Claim;
import com.insurance.homeInsurance.entity.Customer;
import com.insurance.homeInsurance.entity.OwnedPolicy;
import com.insurance.homeInsurance.entity.Property;
import com.insurance.homeInsurance.exception.ClaimException;
import com.insurance.homeInsurance.exception.CustomerException;
import com.insurance.homeInsurance.exception.OwnedPolicyException;
import com.insurance.homeInsurance.exception.PropertyException;


@Service
public class ClaimServiceImpl implements ClaimService{
	
	@Autowired
	ClaimRepository claimRepo;
	
	@Autowired
	PropertyRepository propertyRepo;
	
	@Autowired
	OwnedPolicyRepository ownedPolicyRepo;
	
	@Autowired
	CustomerRepository customerRepo;

	

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
	public Collection<Claim> getAllClaim() {
		return this.claimRepo.findAll();
	}
	
	
	@Override

	public Claim updateClaim(Integer id) throws ClaimException {
		
		Optional<Claim> claimOpt = this.claimRepo.findById(id);
		if(!claimOpt.isPresent()) {
			throw new ClaimException("Claim not found of id --> ");
		}
		Claim claim = claimOpt.get();
		claim.setClaimReviewed(true);
		return this.claimRepo.save(claim);

	}

//	@Override
//	public void getClaimByCustomerId(Integer id) throws CustomerException {
//		// TODO Auto-generated method stub
//		
//		Optional<Customer> custOpt = this.customerRepo.findById(id);
//		 if (!custOpt.isPresent()) {
//		 throw new CustomerException("Customer not found" + id);
//		 }
//		 Customer customer = custOpt.get();
//		  
//		 List<Claim> getAllClaims = customer.getClaimDetails();
//		 
//		return getAllClaims;
//	}

	@Override
	public Claim createClaimByPolicyIdAndCustomerId(Claim newClaim, Integer polId, Integer custId)
			throws ClaimException, OwnedPolicyException, CustomerException {
		
		Optional<OwnedPolicy> polOpt = this.ownedPolicyRepo.findById(polId);
		 if(!polOpt.isPresent()) {
			 throw new OwnedPolicyException("Policy not found" +polId);
			 }
		 OwnedPolicy ownedPolicy = polOpt.get();
		 
		 
		 Optional<Customer> custOpt = this.customerRepo.findById(custId);
		 if(!custOpt.isPresent()) {
			 throw new CustomerException("Customer not found" +polId);
			 }
		 Customer customer = custOpt.get();
		 
		 ownedPolicy.setIssueDate(LocalDate.now());
		 
		 newClaim.setCustomerDetails(customer);
		 newClaim.setOwnedPolicyDetails(ownedPolicy);
		 
		 Claim claim = this.claimRepo.save(newClaim) ;
		 
		 customer.getClaimDetails().add(claim);
		 this.customerRepo.save(customer);

		 return claim;
	}

	@Override
	public List<Claim> getClaimByCustomerId(Integer id) throws CustomerException {
		Optional<Customer> custOpt = this.customerRepo.findById(id);
		 if (!custOpt.isPresent()) {
		 throw new CustomerException("Customer not found" + id);
		 }
		 Customer customer = custOpt.get();
		  
		 List<Claim> getAllClaims = customer.getClaimDetails();
		 
		 if(customer.getClaimDetails().contains(getAllClaims));
		 	return getAllClaims;
		
	}
	
	
	
	

}
