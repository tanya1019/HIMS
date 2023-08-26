package com.insurance.homeInsurance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.homeInsurance.entity.Renewal;

public interface RenewalRepository extends JpaRepository<Renewal, Integer> {

}
