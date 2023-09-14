package com.insurance.homeInsurance.service;

import java.util.Collection;

import com.insurance.homeInsurance.entity.Feature;
import com.insurance.homeInsurance.entity.OwnedPolicy;
import com.insurance.homeInsurance.exception.CustomerException;
import com.insurance.homeInsurance.exception.FeatureException;



public interface FeatureService {
	
	Feature addFeature(Feature newFeature) throws FeatureException ;
	Feature updateFeature(Feature newFeature) throws FeatureException;
	Collection<Feature> getAllFeatures();
	Feature deleteFeatureById(Integer id) throws FeatureException;
	OwnedPolicy getFeatureByOwnedPolicyId(Integer id) throws FeatureException;

}
