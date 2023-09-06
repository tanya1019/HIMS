package com.insurance.homeInsurance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.insurance.homeInsurance.entity.Customer;
import com.insurance.homeInsurance.entity.OwnedPolicy;
import com.insurance.homeInsurance.exception.CustomerException;
import com.insurance.homeInsurance.exception.OwnedPolicyException;
import com.insurance.homeInsurance.service.OwnedPolicyService;

@SpringBootTest
public class OwnedPolicyTest {
	
	  @Autowired
	    private OwnedPolicyService ownedPolicyService;

	    //Not Passed
	    @Test
	    public void createOwnedPolicyByCustomerIdTest() throws OwnedPolicyException, CustomerException {
	        OwnedPolicy ownedPolicy1 = new OwnedPolicy(LocalDate.of(2020, 1, 8),LocalDate.of(2022, 4, 10),"Nomii1",45,"Father");
	        OwnedPolicy ownedPolicy2 = new OwnedPolicy(LocalDate.of(2004, 12, 10),LocalDate.of(2030, 1, 11),"Nomii2",25,"Son");

	 

	        List<OwnedPolicy> ownedPolicylist = new ArrayList<>();
	        ownedPolicylist.add(ownedPolicy1);
	        ownedPolicylist.add(ownedPolicy2);
	        Customer customer = new Customer(17,"1234","17cust@gmail.com","new17cust","pass17");
	         this.ownedPolicyService.createOwnedPolicyByCustomerId(ownedPolicy1,5);
	            assertEquals(true, this.ownedPolicyService.createOwnedPolicyByCustomerId(ownedPolicy1,17));
	            assertEquals(true, this.ownedPolicyService.createOwnedPolicyByCustomerId(ownedPolicy2,17));

	 

	            assertEquals(2, this.ownedPolicyService.getAllOwnedPoliciesByCustomerId(17).size());

	    }

	    //Not Passed
	    @Test
	    public void getAllOwnedPoliciesByCustomerId() throws OwnedPolicyException, CustomerException {
	        assertEquals(2, this.ownedPolicyService.getAllOwnedPoliciesByCustomerId(17).size());
	    }

}
