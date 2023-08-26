package com.insurance.homeInsurance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.homeInsurance.entity.AdminPolicy;

public interface AdminPolicyRepository extends JpaRepository<AdminPolicy, Integer> {

}
