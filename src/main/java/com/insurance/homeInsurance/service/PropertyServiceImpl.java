package com.insurance.homeInsurance.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.insurance.homeInsurance.dao.CustomerRepository;
import com.insurance.homeInsurance.dao.PropertyRepository;
import com.insurance.homeInsurance.entity.Customer;
import com.insurance.homeInsurance.entity.Property;
import com.insurance.homeInsurance.exception.CustomerException;

@Service
public class PropertyServiceImpl implements PropertyService {
	
	@Autowired
	 PropertyRepository propertyRepo;

	 @Autowired
	 CustomerRepository customerRepo;

	 @Override
	 public Property createPropertyByCustomerID(Property newProperty, Integer custId) throws CustomerException {
	 Optional<Customer> custOpt = this.customerRepo.findById(custId);
	 if(!custOpt.isPresent()) {
	 throw new CustomerException("Customer not found" +custId);
	 }
	 Customer customer = custOpt.get();
	newProperty.setCustomer(customer);
	 Property property = this.propertyRepo.save(newProperty) ;
	 customer.getPropertyDetails().add(property);
	 this.customerRepo.save(customer);
	 return property;
	 }
	 
	 
	 
	 
	 
	 @Override

	 public Property getPropertyByCustomerID(Integer propId, Integer CustId) throws CustomerException {

	 Optional<Customer> custOpt = this.customerRepo.findById(CustId);

	 if (!custOpt.isPresent()) {

	 throw new CustomerException("Customer not found" + CustId);

	 }

	 Customer customer = custOpt.get();

	 Optional<Property> propertyOpt = this.propertyRepo.findById(propId);


	 

	 if (!propertyOpt.isPresent()) {

	 throw new CustomerException("property not found" + propertyOpt);

	 }

	 Property property = propertyOpt.get();


	 

	 if (customer.getPropertyDetails().contains(property));

	 return property;

	 // else thro exceprion property does not belong to customer

	 }

}
