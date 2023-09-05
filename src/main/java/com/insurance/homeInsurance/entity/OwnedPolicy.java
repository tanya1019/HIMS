package com.insurance.homeInsurance.entity;

import java.time.LocalDate;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class OwnedPolicy {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@JsonFormat(pattern  = "yyyy-MM-dd" )
	private LocalDate issueDate;
	
	@JsonFormat(pattern  = "yyyy-MM-dd" )
	private LocalDate expiryDate;
	
	private String nomineeName;
	private Integer nomineeAge;
	private String nomineeRelation;
	private Boolean customePolicy = false;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	private AdminPolicy adminPolicy;
	
	@ManyToOne (cascade=CascadeType.ALL)
	@JsonIgnore
	private Customer customer;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JsonIgnore
	private Payment paymentDetails;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Claim claim;
	

	public OwnedPolicy(LocalDate issueDate, LocalDate expiryDate, String nomineeName, Integer nomineeAge,
			String nomineeRelation) {
		super();
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
		this.nomineeName = nomineeName;
		this.nomineeAge = nomineeAge;
		this.nomineeRelation = nomineeRelation;
	}

	
	public OwnedPolicy(AdminPolicy adminPolicy, Customer customer, Payment paymentDetails, Claim claim) {
		super();
		this.adminPolicy = adminPolicy;
		this.customer = customer;
		this.paymentDetails = paymentDetails;
		this.claim = claim;
	}


	public Claim getClaim(Claim claim) {
		return claim;
	}

	public void setClaim(Claim claim) {
		this.claim = claim;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public Integer getNomineeAge() {
		return nomineeAge;
	}

	public void setNomineeAge(Integer nomineeAge) {
		this.nomineeAge = nomineeAge;
	}

	public String getNomineeRelation() {
		return nomineeRelation;
	}

	public void setNomineeRelation(String nomineeRelation) {
		this.nomineeRelation = nomineeRelation;
	}

	public Boolean getCustomePolicy() {
		return customePolicy;
	}

	public void setCustomePolicy(Boolean customePolicy) {
		this.customePolicy = customePolicy;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Payment getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(Payment paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public AdminPolicy getAdminPolicy() {
		return adminPolicy;
	}

	public void setAdminPolicy(AdminPolicy adminPolicy) {
		this.adminPolicy = adminPolicy;
	}

	public OwnedPolicy() {
		super();
	}


	
}
