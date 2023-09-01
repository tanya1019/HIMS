package com.insurance.homeInsurance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.insurance.homeInsurance.entity.AdminPolicy;
import com.insurance.homeInsurance.service.AdminPolicyService;

@SpringBootTest
public class AdminPolicyTest {
	
	@Autowired
	AdminPolicyService adminPolicyService;
	
	@Test
	public void getAdminPolicyTest() {
		AdminPolicy adminPolicy = this.adminPolicyService.getPolicyById(1);
		assertEquals("Policy1", adminPolicy.getPolicyName());
	}

}
