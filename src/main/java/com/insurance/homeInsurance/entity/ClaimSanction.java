package com.insurance.homeInsurance.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class ClaimSanction {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer claimSanctionId;
	
	private Double amount; 
	
	@JsonFormat(pattern  = "yyyy-MM-dd" )
	private LocalDate sanctionDate;
	
	@OneToOne
	private Claim claim;

	public ClaimSanction() {
		super();
	}

	public ClaimSanction(Double amount, LocalDate sanctionDate, Claim claim) {
		super();
		this.amount = amount;
		this.sanctionDate = sanctionDate;
		this.claim = claim;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getSanctionDate() {
		return sanctionDate;
	}

	public void setSanctionDate(LocalDate sanctionDate) {
		this.sanctionDate = sanctionDate;
	}

	public Claim getClaim() {
		return claim;
	}

	public void setClaim(Claim claim) {
		this.claim = claim;
	}
	
	
	
}
