package com.insurance.homeInsurance.service;

import java.util.List;

import com.insurance.homeInsurance.entity.Property;
import com.insurance.homeInsurance.exception.CustomerException;
import com.insurance.homeInsurance.exception.PropertyException;

public interface PropertyService {
	
	
	Property createPropertyByCustomerID(Property newProperty, Integer custId)throws CustomerException;

	Property getPropertyByCustomerID(Integer propId, Integer CustId) throws CustomerException, PropertyException;
	
	List<Property> getPropertyByCustomerID (Integer id) throws CustomerException;
	

	

}
