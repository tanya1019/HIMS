package com.insurance.homeInsurance.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.insurance.homeInsurance.entity.Admin;


public interface AdminRepository extends JpaRepository<Admin,Integer> {
	
	 
	Optional<Admin> findByEmail(String email);

}
