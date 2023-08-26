package com.insurance.homeInsurance.service;

import com.insurance.homeInsurance.entity.AdminPolicy;

public interface AdminPolicyService {

	AdminPolicy createAdminPolicy(AdminPolicy newPolicy);
    AdminPolicy getPolicyById(Integer id);
}
