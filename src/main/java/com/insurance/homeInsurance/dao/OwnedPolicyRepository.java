package com.insurance.homeInsurance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.homeInsurance.entity.OwnedPolicy;

public interface OwnedPolicyRepository extends JpaRepository<OwnedPolicy, Integer>{

}
