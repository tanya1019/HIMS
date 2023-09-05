package com.insurance.homeInsurance.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.homeInsurance.dao.AdminPolicyRepository;
import com.insurance.homeInsurance.entity.AdminPolicy;

@Service
public class AdminPolicyServiceImpl implements AdminPolicyService {
	
	@Autowired
	private AdminPolicyRepository adminPolicyRepo;

	
	@Override
	public AdminPolicy createAdminPolicy(AdminPolicy newPolicy) {
		return this.adminPolicyRepo.save(newPolicy);
	}

	@Override
	public AdminPolicy getPolicyById(Integer id) {
		  Optional<AdminPolicy> adminPolicy =  this.adminPolicyRepo.findById(id);
	        return adminPolicy.get();
	}

}
