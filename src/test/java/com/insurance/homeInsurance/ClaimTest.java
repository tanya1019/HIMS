package com.insurance.homeInsurance;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.insurance.homeInsurance.entity.Claim;
import com.insurance.homeInsurance.entity.OwnedPolicy;
import com.insurance.homeInsurance.entity.Property;
import com.insurance.homeInsurance.exception.CustomerException;
import com.insurance.homeInsurance.service.ClaimService;

@SpringBootTest
public class ClaimTest {
	
	@Autowired
	ClaimService claimService;
	
//	@Test
//	public void createClaimByPolicyIdAndPropertyIdTest() {
//		Claim claim1 = new Claim(1,"2001-11-02",["docs","docs1"],"cause1",8000.0,"debit","2001-11-02",new OwnedPolicy(1,null,null,null,8,"reln",false,null,null,null,null),new Property(1,81,null,null,null,null,null,null,null,null,false,null,null,null));
//		Claim claim = this.claimService.createClaimByPolicyIdAndPropertyId(1, 1, 1);
//	}
	
	@Test
	public void getClaimByPolicyIdAndCustomerIdTest() {
		try {
			Claim claim = this.claimService.getClaimByPolicyIdAndPropertyId(1, 1, 1);
			assertEquals(1, claim.getId());

			
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
