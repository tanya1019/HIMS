package com.insurance.homeInsurance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.insurance.homeInsurance.dto.loginDto;
import com.insurance.homeInsurance.entity.Customer;
import com.insurance.homeInsurance.entity.PropertyType;
import com.insurance.homeInsurance.exception.CustomerException;
import com.insurance.homeInsurance.service.CustomerService;



@SpringBootTest
public class CustomerTest {

	@Autowired
	CustomerService custService;
	
	//Not Passed
	@Test
	public void addCustomerTest() {
		System.out.println("addCustomerTest");
		Customer newCustomer = new Customer(10,"1567","cust1@gmail.com","cust1Name","cust1Pass",PropertyType.Owned,"123Stripe",null,null);
		
			try {
				assertEquals(true, this.custService.addCustomer(newCustomer));
			} catch (CustomerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			assertEquals(3, this.custService.getAllCustomer().size());
			
	}
	
	@Test
	public void getCustomerByIdTest() {
		try {
			Customer customer = this.custService.getCustomerById(1);
			assertEquals("Cust", customer.getName());

		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
//	Closing JPA EntityManagerFactory for persistence unit 'default'
	@Test
	public void loginCustomerTest() {
		try {
			loginDto loginUser = new loginDto();
			loginUser.setEmail("abc78ghjk");
			loginUser.setPassword("str23456");
			Customer customer = this.custService.login(loginUser);
			assertEquals("JKL@5",customer.getName());
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	//for true false --write test case
	
	
	

}
