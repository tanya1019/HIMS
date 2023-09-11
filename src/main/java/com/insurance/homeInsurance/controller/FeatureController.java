package com.insurance.homeInsurance.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.homeInsurance.entity.Feature;
import com.insurance.homeInsurance.entity.OwnedPolicy;
import com.insurance.homeInsurance.exception.CustomerException;
import com.insurance.homeInsurance.exception.FeatureException;
import com.insurance.homeInsurance.service.FeatureService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FeatureController {

	
	@Autowired
	FeatureService featureService;
	
	
	@PostMapping("/feature")
	public Feature addFeature(@RequestBody Feature newFeature) throws FeatureException {
		
		try {
			return this.featureService.addFeature(newFeature);
		}catch (FeatureException e) {
			throw e;
		}
	}
	
	@GetMapping("/features")
	public Collection<Feature> getAllFeature() {
		return this.featureService.getAllFeatures();
	}
	
	
	
	
	@DeleteMapping("/feature/{id}")
	public ResponseEntity<Feature> deleteFeatureById(@PathVariable ("id") Integer id) throws FeatureException{
		Feature feature = this.featureService.deleteFeatureById(id);
		return new ResponseEntity<Feature> (feature, HttpStatus.OK);
	}
	
	
	@GetMapping("/feature/{id}")
	 public OwnedPolicy getCustomerById(@PathVariable("id") Integer id) throws FeatureException {

		 return this.featureService.getFeatureByOwnedPolicyId(id); 
	 }
	
	
	@PutMapping("/feature/{id}")

    public Feature updateFeatureById(@RequestBody Feature feature) throws FeatureException, CustomerException {

        return this.featureService.updateFeature(feature);     

 

    }
	
}
