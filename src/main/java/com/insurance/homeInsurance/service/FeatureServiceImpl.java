package com.insurance.homeInsurance.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.homeInsurance.dao.FeatureRepository;
import com.insurance.homeInsurance.dao.OwnedPolicyRepository;

import com.insurance.homeInsurance.entity.Feature;
import com.insurance.homeInsurance.entity.OwnedPolicy;
import com.insurance.homeInsurance.exception.CustomerException;
import com.insurance.homeInsurance.exception.FeatureException;



@Service
public class FeatureServiceImpl implements FeatureService {

	@Autowired
	FeatureRepository featureRepo;
	
	
	@Autowired
	OwnedPolicyRepository ownedPolicyRepo;
	

	
	@Override
	public Feature addFeature(Feature newFeature) throws FeatureException {
		//created by Anish
		//add new feature 
		//Exception handling for adding new feature
		Optional<Feature> FeatureOpt = this.featureRepo.findById(newFeature.getId());
		
		if(FeatureOpt.isPresent()) 
			throw new FeatureException("Product Already Exist with id: " + newFeature.getId());
	
		return this.featureRepo.save(newFeature);
	}
	
	
	@Override
	public Feature updateFeature(Feature newFeature) throws CustomerException {
		
		Optional<Feature> customerOpt = this.featureRepo.findById(newFeature.getId());
		
		if(!customerOpt.isPresent()) {
			throw new CustomerException("Product not found of id --> " + newFeature.getId());
		}
		return this.featureRepo.save(newFeature);
	}
	
	
	@Override
	public Collection<Feature> getAllFeatures() {
		//created by Anish
		//get all features 
		return this.featureRepo.findAll();
	}


	@Override
	public Feature deleteFeatureById(Integer id) throws FeatureException {

		Optional<Feature> FeatureOpt = this.featureRepo.findById(id);
		
		if(!FeatureOpt.isPresent()) {
			throw new FeatureException("Item not found to delete, id no. is --> " + id);
		}
		
		this.featureRepo.delete(FeatureOpt.get());
		return null;
	}



	@Override
	public OwnedPolicy getFeatureByOwnedPolicyId(Integer id) throws FeatureException {
		//find feature by policy id
		Optional<OwnedPolicy>featureOpt = this.ownedPolicyRepo.findById(id);
		if(!featureOpt.isPresent())
			throw new FeatureException("Feature Not Found for policy id: "+id);
		return featureOpt.get();
	}

	
	
}
