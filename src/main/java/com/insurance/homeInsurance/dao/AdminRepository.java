package com.insurance.homeInsurance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.homeInsurance.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer> {

}
