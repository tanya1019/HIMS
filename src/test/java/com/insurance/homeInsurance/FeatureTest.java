package com.insurance.homeInsurance;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.insurance.homeInsurance.exception.FeatureException;
import com.insurance.homeInsurance.service.FeatureService;

@SpringBootTest
public class FeatureTest {
	@Autowired
	FeatureService featureService;

	@Test
	public void deleteFeatureByIdTest() {
		try {
			this.featureService.deleteFeatureById(10);
			assertTrue(this.featureService.getFeatureByOwnedPolicyId(1)==null);
		} catch (FeatureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
