package com.insurance.homeInsurance.service;

import java.util.Collection;
import java.util.List;

import com.insurance.homeInsurance.entity.AdminPolicy;
import com.insurance.homeInsurance.exception.AdminPolicyException;


public interface AdminPolicyService {

	AdminPolicy createAdminPolicy(AdminPolicy newPolicy);
    AdminPolicy getPolicyById(Integer id);
    
    List<AdminPolicy> getAllPolicy() throws AdminPolicyException;
    
    Collection<AdminPolicy> getAllPolicies();
}
