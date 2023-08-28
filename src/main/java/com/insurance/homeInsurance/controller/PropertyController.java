package com.insurance.homeInsurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.homeInsurance.entity.Property;
import com.insurance.homeInsurance.exception.CustomerException;
import com.insurance.homeInsurance.service.PropertyService;

@RestController
public class PropertyController {

	
	@Autowired
	 PropertyService propertyServices;

	 @PostMapping("/createProperty/{id}")
	 public Property createPropertyByCustomerID(@RequestBody Property newProperty, @PathVariable("id") Integer id) throws CustomerException {
	 return this.propertyServices.createPropertyByCustomerID(newProperty, id) ;
	}
	 
	 @GetMapping("/getProperty/{custId}/{propId}") 
	 public Property getPropertyByCustomerID(@PathVariable("custId") Integer CustId, @PathVariable("propId") Integer PropId ) throws CustomerException{
	 return this.propertyServices.getPropertyByCustomerID (CustId, PropId);

	 }
	 
	 @GetMapping("/getAllProperties/{custId}") 
	 public List<Property> getPropertiesByCustomerId(@PathVariable("custId") Integer CustId ) throws CustomerException{
	 return this.propertyServices.getPropertiesByCustomerId(CustId);

	 }
}
