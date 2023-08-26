package com.insurance.homeInsurance.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Property {

	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	Integer propId;
	
	String houseNo;
	Double areaInSquareFeet;
	Double costOfProperty;
	Double ageOfBuilding;
    Integer pincode;
    String  city;
	String  streetNumber;
	String  region;
	Boolean policyClaimed = false;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	@JsonIgnore
	Customer customer;
	
	@OneToOne(cascade = {CascadeType.ALL})
	OwnedPolicy ownedPolicy;
	
	@OneToOne(cascade = {CascadeType.ALL})
	Claim claim ;
	
	public Property() {
		super();
	}
	
	public Property(Integer propId, String houseNo, Double areaInSquareFeet, Double costOfProperty,
			Double ageOfBuilding, Integer pincode, String city, String streetNumber, String region,
			Boolean policyClaimed, Customer customer, OwnedPolicy ownedPolicy, Claim claim) {
		super();
		this.propId = propId;
		this.houseNo = houseNo;
		this.areaInSquareFeet = areaInSquareFeet;
		this.costOfProperty = costOfProperty;
		this.ageOfBuilding = ageOfBuilding;
		this.pincode = pincode;
		this.city = city;
		this.streetNumber = streetNumber;
		this.region = region;
		this.policyClaimed = policyClaimed;
		this.customer = customer;
		this.ownedPolicy = ownedPolicy;
		this.claim = claim;
	}

	public Integer getPropId() {
		return propId;
	}
	public void setPropId(Integer propId) {
		this.propId = propId;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public Double getAreaInSquareFeet() {
		return areaInSquareFeet;
	}
	public void setAreaInSquareFeet(Double areaInSquareFeet) {
		this.areaInSquareFeet = areaInSquareFeet;
	}
	public Double getCostOfProperty() {
		return costOfProperty;
	}
	public void setCostOfProperty(Double costOfProperty) {
		this.costOfProperty = costOfProperty;
	}
	public Double getAgeOfBuilding() {
		return ageOfBuilding;
	}
	public void setAgeOfBuilding(Double ageOfBuilding) {
		this.ageOfBuilding = ageOfBuilding;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Boolean getPolicyClaimed() {
		return policyClaimed;
	}
	public void setPolicyClaimed(Boolean policyClaimed) {
		this.policyClaimed = policyClaimed;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public OwnedPolicy getOwnedPolicy() {
		return ownedPolicy;
	}

	public void setOwnedPolicy(OwnedPolicy ownedPolicy) {
		this.ownedPolicy = ownedPolicy;
	}

	public Claim getClaim() {
		return claim;
	}

	public void setClaim(Claim claim) {
		this.claim = claim;
	}

	@Override
	public String toString() {
		return "Property [propId=" + propId + ", houseNo=" + houseNo + ", areaInSquareFeet=" + areaInSquareFeet
				+ ", costOfProperty=" + costOfProperty + ", ageOfBuilding=" + ageOfBuilding + ", pincode=" + pincode
				+ ", city=" + city + ", streetNumber=" + streetNumber + ", region=" + region + ", policyClaimed="
				+ policyClaimed + ", customer=" + customer + ", ownedPolicy=" + ownedPolicy + ", claim=" + claim + "]";
	}
	
	
	
}
