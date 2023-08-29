package com.insurance.homeInsurance.service;


import java.util.List;

import com.insurance.homeInsurance.entity.OwnedPolicy;
import com.insurance.homeInsurance.entity.Property;
import com.insurance.homeInsurance.exception.CustomerException;
import com.insurance.homeInsurance.exception.OwnedPolicyException;

public interface OwnedPolicyService {
	OwnedPolicy createOwnedPolicyByCustomerId( OwnedPolicy newOwnedPolicy , Integer CustId) throws OwnedPolicyException;
	List<OwnedPolicy> getownedPolicyByCustomerId (Integer CustId) throws OwnedPolicyException;
}
