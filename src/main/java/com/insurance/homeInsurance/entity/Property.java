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

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer propId;
	
	Integer custId;
	String address;
	String country;
	String  city;
	Integer pincode;
	Double areaInSquareFeet;
	Double costOfProperty;
	Double ageOfBuilding;
	PropertyType  propertyType;
	Boolean policyClaimed = false;
	Double premiumAmount ;
	Double contentsCost;
	String state;
	
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
	
	


	


	public Double getPremiumAmount() {
		return premiumAmount;
	}







	public void setPremiumAmount(Double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}







	public Double getContentsCost() {
		return contentsCost;
	}







	public void setContentsCost(Double contentsCost) {
		this.contentsCost = contentsCost;
	}







	public String getState() {
		return state;
	}







	public void setState(String state) {
		this.state = state;
	}







	public Property(Integer propId, String houseNo, Double areaInSquareFeet, Double costOfProperty ){
		super();
		this.propId = propId;
	
		this.areaInSquareFeet = areaInSquareFeet;
		this.costOfProperty = costOfProperty;
	
	}









	public Property(Integer propId, Integer custId, String address, String country, String city, Integer pincode,
			Double areaInSquareFeet, Double costOfProperty, Double ageOfBuilding, PropertyType propertyType,
			Boolean policyClaimed, Customer customer, OwnedPolicy ownedPolicy, Claim claim) {
		super();
		this.propId = propId;
		this.custId = custId;
		this.address = address;
		this.country = country;
		this.city = city;
		this.pincode = pincode;
		this.areaInSquareFeet = areaInSquareFeet;
		this.costOfProperty = costOfProperty;
		this.ageOfBuilding = ageOfBuilding;
		this.propertyType = propertyType;
		this.policyClaimed = policyClaimed;
		this.customer = customer;
		this.ownedPolicy = ownedPolicy;
		this.claim = claim;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public Claim getClaim() {
		return claim;
	}



	public Integer getCustId() {
		return custId;
	}



	public void setCustId(Integer custId) {
		this.custId = custId;
	}



	public Integer getPropId() {
		return propId;
	}
	public void setPropId(Integer propId) {
		this.propId = propId;
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

	public Claim getClaim(Claim claim) {
		return claim;
	}

	public void setClaim(Claim claim) {
		this.claim = claim;
	}



	public PropertyType getPropertyType() {
		return propertyType;
	}



	public void setPropertyType(PropertyType propertyType) {
		this.propertyType = propertyType;
	}
	


	
	
	
}
