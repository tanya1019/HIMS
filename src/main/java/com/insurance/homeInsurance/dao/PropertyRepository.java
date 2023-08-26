package com.insurance.homeInsurance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.homeInsurance.entity.Property;

public interface PropertyRepository extends JpaRepository<Property, Integer> {

}
