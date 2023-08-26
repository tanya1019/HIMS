package com.insurance.homeInsurance.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Payment {

	@Id
	Integer payment_id;
	
	Double paymentAmount;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	LocalDate paymentDate;
	
	String paymentType;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	Customer customerDeatails;
	
	@OneToOne(cascade = {CascadeType.ALL})
	OwnedPolicy ownedPolicyDetail;
	
	public Payment() {
		super();
	}
	
	public Payment(Integer payment_id, Double paymentAmount, LocalDate paymentDate, String paymentType,
			Customer customerDeatails, OwnedPolicy ownedPolicyDetail) {
		super();
		this.payment_id = payment_id;
		this.paymentAmount = paymentAmount;
		this.paymentDate = paymentDate;
		this.paymentType = paymentType;
		this.customerDeatails = customerDeatails;
		this.ownedPolicyDetail = ownedPolicyDetail;
	}

	
	public Integer getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(Integer payment_id) {
		this.payment_id = payment_id;
	}

	public Customer getCustomerDeatails() {
		return customerDeatails;
	}

	public void setCustomerDeatails(Customer customerDeatails) {
		this.customerDeatails = customerDeatails;
	}

	public OwnedPolicy getOwnedPolicyDetail() {
		return ownedPolicyDetail;
	}

	public void setOwnedPolicyDetail(OwnedPolicy ownedPolicyDetail) {
		this.ownedPolicyDetail = ownedPolicyDetail;
	}

	public Double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(Double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	@Override
	public String toString() {
		return "Payment [payment_id=" + payment_id + ", paymentAmount=" + paymentAmount + ", paymentDate=" + paymentDate
				+ ", paymentType=" + paymentType + ", customerDeatails=" + customerDeatails + ", ownedPolicyDetail="
				+ ownedPolicyDetail + "]";
	}
	
	
}
