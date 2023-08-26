package com.insurance.homeInsurance.service;

import com.insurance.homeInsurance.entity.Property;
import com.insurance.homeInsurance.exception.CustomerException;

public interface PropertyService {
	
	
	Property createPropertyByCustomerID(Property newProperty, Integer custId)throws CustomerException;

	Property getPropertyByCustomerID(Integer propId, Integer CustId) throws CustomerException;

	

}
