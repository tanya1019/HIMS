package com.insurance.homeInsurance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.homeInsurance.entity.TransactionDetails;


public interface TransactionDetailRepository extends JpaRepository<TransactionDetails, Integer> {

}
