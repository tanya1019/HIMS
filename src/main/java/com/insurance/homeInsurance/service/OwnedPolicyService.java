package com.insurance.homeInsurance.service;


import java.util.List;

import com.insurance.homeInsurance.entity.OwnedPolicy;

import com.insurance.homeInsurance.exception.CustomerException;


public interface OwnedPolicyService {
	OwnedPolicy createOwnedPolicyByCustomerId( OwnedPolicy newOwnedPolicy , Integer CustId) throws CustomerException;
	List<OwnedPolicy> getAllOwnedPoliciesByCustomerId (Integer CustId) throws CustomerException;
}
