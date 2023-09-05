package com.insurance.homeInsurance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.insurance.homeInsurance.dto.loginDto;
import com.insurance.homeInsurance.entity.Customer;

import com.insurance.homeInsurance.exception.CustomerException;
import com.insurance.homeInsurance.service.CustomerService;



@SpringBootTest
public class CustomerTest {

	@Autowired
	private CustomerService custService;
	
	//Not Passed
	@Test
	public void addCustomerTest() throws CustomerException {
		Customer newCustomer = new Customer(20,"765","email","cust20","pass12");
		     assertEquals(true, this.custService.addCustomer(newCustomer));
//			assertEquals(5, this.custService.getAllCustomers().size());
			
	}
	
	@Test
	public void updateCustomerTest() throws CustomerException {
		Customer customer = this.custService.updateCustomerUsingId(new Customer(5,"4532","cust5@gmail","cust5name","pass5"));
		assertEquals("cust5name",customer.getName());
	}
	
	
	@Test
	public void getAllCustomers() {
		assertEquals(4,this.custService.getAllCustomers().size());
	}
	@Test
	public void getCustomerByIdTest() throws CustomerException {
			Customer customer = this.custService.getCustomerById(1);
			assertEquals("Cust", customer.getName());
		
	}
	
	
//	Closing JPA EntityManagerFactory for persistence unit 'default'
	@Test
	public void loginCustomerTest() throws CustomerException {
			loginDto loginUser = new loginDto();
			loginUser.setEmail("abc78ghjk");
			loginUser.setPassword("str23456");
			Customer customer = this.custService.login(loginUser);
			assertEquals("JKL@5",customer.getName());

	}
	
	
	//for true false --write test case
	
	
	

}
