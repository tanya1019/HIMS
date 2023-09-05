package com.insurance.homeInsurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.homeInsurance.entity.AdminPolicy;
import com.insurance.homeInsurance.service.AdminPolicyService;

@RestController
public class AdminPolicyController {
	
	@Autowired
	private AdminPolicyService adminPolicyService;

	@PostMapping("/adminPolicy")
    public AdminPolicy createAdminPolicy(@RequestBody AdminPolicy newAdminPolicy) {
        return this.adminPolicyService.createAdminPolicy(newAdminPolicy);
    }

    
    @GetMapping("/adminPolicy/{id}")
    public AdminPolicy getAdminPolicyById(@PathVariable("id") Integer id) {
        AdminPolicy adminGet = this.adminPolicyService.getPolicyById(id);
        return adminGet;
    }

	
}
