package com.insurance.homeInsurance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.homeInsurance.entity.Feature;

public interface FeatureRepository extends JpaRepository<Feature, Integer> {

}
