package com.insurance.homeInsurance.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Renewal {

	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	Integer id;
	
	@JsonFormat(pattern  = "yyyy-MM-dd" )
	LocalDate renewalDate;
	
	@OneToOne(cascade = {CascadeType.ALL})
	OwnedPolicy ownedPolicy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getRenewalDate() {
		return renewalDate;
	}

	public void setRenewalDate(LocalDate renewalDate) {
		this.renewalDate = renewalDate;
	}

	public OwnedPolicy getOwnedPolicy() {
		return ownedPolicy;
	}

	public void setOwnedPolicy(OwnedPolicy ownedPolicy) {
		this.ownedPolicy = ownedPolicy;
	}

	@Override
	public String toString() {
		return "Renewal [id=" + id + ", renewalDate=" + renewalDate + ", ownedPolicy=" + ownedPolicy + "]";
	}

	public Renewal() {
		super();
	}

	public Renewal(Integer id, LocalDate renewalDate, OwnedPolicy ownedPolicy) {
		super();
		this.id = id;
		this.renewalDate = renewalDate;
		this.ownedPolicy = ownedPolicy;
	}
	
}
