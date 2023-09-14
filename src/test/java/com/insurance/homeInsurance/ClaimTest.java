package com.insurance.homeInsurance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.insurance.homeInsurance.entity.Claim;
import com.insurance.homeInsurance.exception.ClaimException;
import com.insurance.homeInsurance.exception.CustomerException;
import com.insurance.homeInsurance.exception.OwnedPolicyException;
import com.insurance.homeInsurance.exception.PropertyException;
import com.insurance.homeInsurance.service.ClaimService;

 

@SpringBootTest
public class ClaimTest {

//    @Autowired
//    private ClaimService claimService;
//
//    @Test
//    public void createClaimByPolicyIdAndPropertyIdTest() throws ClaimException, CustomerException, PropertyException, OwnedPolicyException {
//        Claim claim = new Claim(19,LocalDate.of(2019, 8, 15),"Cause1",1234.00);
//        assertEquals(true,this.claimService.createClaimByPolicyIdAndPropertyId(claim, 11));
//    }
//
//    @Test
//    public void getClaimByPolicyIdAndCustomerIdTest() throws CustomerException, ClaimException, PropertyException, OwnedPolicyException {
//            Claim claim = this.claimService.getClaimByPolicyIdAndPropertyId(1, 1, 1);
//            assertEquals(1, claim.getId());
//    }
//
//    @Test
//    public void getAllClaimsTest() throws ClaimException, CustomerException, PropertyException, OwnedPolicyException {
//        this.claimService.createClaimByPolicyIdAndPropertyId(new Claim(19,LocalDate.of(2019, 8, 15),"Cause1",1234.00), 11);
//        this.claimService.createClaimByPolicyIdAndPropertyId(new Claim(20,LocalDate.of(2020, 9, 20),"Cause2",4534.00), 23);
//        this.claimService.createClaimByPolicyIdAndPropertyId(new Claim(21,LocalDate.of(2023, 12, 30),"Cause3",2234.00), 34);
//
// 
//
//        assertEquals(3,this.claimService.getAllClaim().size());
//
//    }

 

}