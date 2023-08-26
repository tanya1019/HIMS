package com.insurance.homeInsurance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.homeInsurance.entity.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Integer>{

}
