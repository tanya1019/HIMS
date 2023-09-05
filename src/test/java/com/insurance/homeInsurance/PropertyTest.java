package com.insurance.homeInsurance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.insurance.homeInsurance.entity.Property;
import com.insurance.homeInsurance.exception.CustomerException;
import com.insurance.homeInsurance.exception.OwnedPolicyException;
import com.insurance.homeInsurance.service.CustomerService;
import com.insurance.homeInsurance.service.PropertyService;

@SpringBootTest
public class PropertyTest {
	
	@Autowired
	private PropertyService propertyService;
	
	@Autowired
	private CustomerService custService;
	
	//Not Passed
	@Test
	public void createPropertyByCustomerIDTest() throws CustomerException, OwnedPolicyException {
		assertNotNull(custService.getCustomerById(17));
		
		Property property = new Property(11,"h12",123.98,2000.0);
		assertEquals(true,this.propertyService.createPropertyByCustomerID(property, 17));
	}
	
	//Not Passed
	@Test
	public void getPropertyByCustomerIDTest() throws CustomerException {
		Property property = this.propertyService.getPropertyByCustomerID(17, 11);
		assertEquals("h12",property.getHouseNo());
	}
	
	//Not Passed
	@Test
	public void getPropertiesByCustomerIdTest() throws CustomerException {
		Property property1 = new Property(11,"h12",123.98,2000.0);
		Property property2 = new Property(12,"h13",345.8,6000.0);
		property1 = this.propertyService.createPropertyByCustomerID(property1, 17);
		property2 = this.propertyService.createPropertyByCustomerID(property2, 17);
		
		assertEquals(2,this.propertyService.getPropertiesByCustomerId(17).size());

		
	}

}
