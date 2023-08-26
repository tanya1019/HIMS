package com.insurance.homeInsurance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.homeInsurance.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
