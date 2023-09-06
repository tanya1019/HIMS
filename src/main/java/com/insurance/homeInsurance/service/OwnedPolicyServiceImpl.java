package com.insurance.homeInsurance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.homeInsurance.dao.CustomerRepository;
import com.insurance.homeInsurance.dao.OwnedPolicyRepository;
import com.insurance.homeInsurance.entity.Customer;
import com.insurance.homeInsurance.entity.OwnedPolicy;
import com.insurance.homeInsurance.exception.CustomerException;

@Service
public class OwnedPolicyServiceImpl implements OwnedPolicyService {

	@Autowired
	OwnedPolicyRepository ownedPolicyRepo;
      @Autowired
    CustomerRepository customerRepo;
	
	
		@Override
		public OwnedPolicy createOwnedPolicyByCustomerId(OwnedPolicy newOwnedPolicy, Integer CustId)
			throws CustomerException {
	        Optional<Customer> custOpt = this.customerRepo.findById(CustId);
	         if(!custOpt.isPresent()) {
	           throw new CustomerException("Customer not found" +CustId);
	         }

	         Customer customer = custOpt.get();
	         newOwnedPolicy.setCustomer(customer);
	         OwnedPolicy ownedPolicy = this.ownedPolicyRepo.save(newOwnedPolicy);
	         customer.getOwnedPolicy().add(ownedPolicy);
	         this.customerRepo.save(customer);
	         return ownedPolicy;	
	}
		@Override
		public List<OwnedPolicy> getAllOwnedPoliciesByCustomerId(Integer CustId) throws CustomerException {
			Optional<Customer> custOpt = this.customerRepo.findById(CustId);
	         if(!custOpt.isPresent()) {
	          throw new CustomerException("Customer not found" +CustId);
	         }
	        Customer customer = custOpt.get();
	        List<OwnedPolicy> getAllPolicies = customer.getOwnedPolicy();       
	        return getAllPolicies; 
			
		}



	


	
	
	
	
	
	
	
	
//	
//	@Override
//	public OwnedPolicy createOwnedPolicyByCustomerId(OwnedPolicy newOwnedPolicy) {
//		return this.ownedPolicyRepo.save(newOwnedPolicy);
//	}
//
//	@Override
//	public OwnedPolicy getOwnedPolicyByCustomerId(Integer id) throws OwnedPolicyException{
//		Optional<OwnedPolicy> ownedPolicyOpt = this.ownedPolicyRepo.findById(id);
//		if(!ownedPolicyOpt.isPresent()) {
//			throw new OwnedPolicyException("owned policy is present" +id);
//		}
//		return ownedPolicyOpt.get();
//	}
//
//	@Override
//	public List<Property> getownedPolicyByCustomerId(Integer id) throws CustomerException {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
