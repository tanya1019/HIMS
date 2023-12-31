package com.insurance.homeInsurance.entity;

import java.time.LocalDate;
import java.util.Arrays;

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
public class Claim {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	
	@JsonFormat(pattern  = "yyyy-MM-dd" )
	LocalDate claimedDate;
	
	String [] documentProof;
	String causeOfClaim;
	Double claimableAmount;
	
	Double claimRequestAmount;
	Boolean claimReviewed;
	
	
	@JsonFormat(pattern  = "yyyy-MM-dd" )
	LocalDate dateOfIncident;
	
	@OneToOne(cascade=CascadeType.ALL)
	OwnedPolicy ownedPolicyDetails;

	@OneToOne(cascade=CascadeType.ALL)
	Property propertyDetails;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JsonIgnore
	Customer customerDetails;
	
	
	public LocalDate getDateOfIncident() {
		return dateOfIncident;
	}


	public void setDateOfIncident(LocalDate dateOfIncident) {
		this.dateOfIncident = dateOfIncident;
	}


	public OwnedPolicy getOwnedPolicyDetails() {
		return ownedPolicyDetails;
	}


	public void setOwnedPolicyDetails(OwnedPolicy ownedPolicyDetails) {
		this.ownedPolicyDetails = ownedPolicyDetails;
	}


	public Property getPropertyDetails() {
		return propertyDetails;
	}


	public void setPropertyDetails(Property propertyDetails) {
		this.propertyDetails = propertyDetails;
	}

	public Double getClaimRequestAmount() {
		return claimRequestAmount;
	}


	public void setClaimRequestAmount(Double claimRequestAmount) {
		this.claimRequestAmount = claimRequestAmount;
	}


	public Boolean getClaimReviewed() {
		return claimReviewed;
	}


	public void setClaimReviewed(Boolean claimReviewed) {
		this.claimReviewed = claimReviewed;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getClaimedDate() {
		return claimedDate;
	}


	public void setClaimedDate(LocalDate claimedDate) {
		this.claimedDate = claimedDate;
	}


	public String[] getDocumentProof() {
		return documentProof;
	}


	public void setDocumentProof(String [] documentProof) {
		this.documentProof = documentProof;
	}


	public String getCauseOfClaim() {
		return causeOfClaim;
	}


	public void setCauseOfClaim(String causeOfClaim) {
		this.causeOfClaim = causeOfClaim;
	}


	public Double getClaimableAmount() {
		return claimableAmount;
	}


	public void setClaimableAmount(Double claimableAmount) {
		this.claimableAmount = claimableAmount;
	}


	
	public Claim() {
		super();
	}

	public Claim(Integer id, LocalDate claimedDate, String[] documentProof, String causeOfClaim, Double claimableAmount,
			Double claimRequestAmount, Boolean claimReviewed, LocalDate dateOfIncident, OwnedPolicy ownedPolicyDetails,
			Property propertyDetails) {
		super();
		this.id = id;
		this.claimedDate = claimedDate;
		this.documentProof = documentProof;
		this.causeOfClaim = causeOfClaim;
		this.claimableAmount = claimableAmount;
		this.claimRequestAmount = claimRequestAmount;
		this.claimReviewed = claimReviewed;
		this.dateOfIncident = dateOfIncident;
		this.ownedPolicyDetails = ownedPolicyDetails;
		this.propertyDetails = propertyDetails;
	}


	public Customer getCustomerDetails() {
		return customerDetails;
	}


	public void setCustomerDetails(Customer customerDetails) {
		this.customerDetails = customerDetails;
	}


	public Claim(Integer id, LocalDate claimedDate, String[] documentProof, String causeOfClaim, Double claimableAmount,
			Double claimRequestAmount, Boolean claimReviewed, LocalDate dateOfIncident, OwnedPolicy ownedPolicyDetails,
			Property propertyDetails, Customer customerDetails) {
		super();
		this.id = id;
		this.claimedDate = claimedDate;
		this.documentProof = documentProof;
		this.causeOfClaim = causeOfClaim;
		this.claimableAmount = claimableAmount;
		this.claimRequestAmount = claimRequestAmount;
		this.claimReviewed = claimReviewed;
		this.dateOfIncident = dateOfIncident;
		this.ownedPolicyDetails = ownedPolicyDetails;
		this.propertyDetails = propertyDetails;
		this.customerDetails = customerDetails;
	}


	public Claim(Integer id, LocalDate claimedDate, String causeOfClaim, Double claimableAmount) {
		super();
		this.id = id;
		this.claimedDate = claimedDate;
		this.causeOfClaim = causeOfClaim;
		this.claimableAmount = claimableAmount;
	}


	@Override
	public String toString() {
		return "Claim [id=" + id + ", claimedDate=" + claimedDate + ", documentProof=" + Arrays.toString(documentProof)
				+ ", causeOfClaim=" + causeOfClaim + ", claimableAmount=" + claimableAmount + ", claimRequestAmount="
				+ claimRequestAmount + ", claimReviewed=" + claimReviewed + ", dateOfIncident=" + dateOfIncident
				+ ", ownedPolicyDetails=" + ownedPolicyDetails + ", propertyDetails=" + propertyDetails + "]";
	}


	
	
	
	
}
