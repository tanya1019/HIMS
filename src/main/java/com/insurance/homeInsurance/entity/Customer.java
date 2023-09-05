package com.insurance.homeInsurance.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String contactNumber;
	private String email;
	private String name;
	
	@Column(nullable = false)
	private String password;
	
	private PropertyType propertType;
	
	private String stripeId;
	
	
	@OneToMany(cascade = {CascadeType.ALL})
	private List<OwnedPolicy> ownedPolicy = new ArrayList<>();
	
	@OneToMany(cascade = {CascadeType.ALL})
	private List<Property> propertyDetails = new ArrayList<>();
	
	
	
	
	
	public Customer() {
		super();
	
	}

	public Customer(Integer id, String contactNumber, String email, String name, String password) {
	super();
	this.id = id;
	this.contactNumber = contactNumber;
	this.email = email;
	this.name = name;
	this.password = password;
}









	public Customer(PropertyType propertType, String stripeId, List<OwnedPolicy> ownedPolicy,
			List<Property> propertyDetails) {
		super();
		this.propertType = propertType;
		this.stripeId = stripeId;
		this.ownedPolicy = ownedPolicy;
		this.propertyDetails = propertyDetails;
	}









	public List<OwnedPolicy> getOwnedPolicy() {
		return ownedPolicy;
	}





	public String getStripeId() {
		return stripeId;
	}











	public void setStripeId(String stripeId) {
		this.stripeId = stripeId;
	}











	public void setOwnedPolicy(List<OwnedPolicy> ownedPolicy) {
		this.ownedPolicy = ownedPolicy;
	}





	public List<Property> getPropertyDetails() {
		return propertyDetails;
	}





	public void setPropertyDetails(List<Property> propertyDetails) {
		this.propertyDetails = propertyDetails;
	}





	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNUmber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
//		 BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		this.password = passwordEncoder.encode(password);
		this.password = password;
	}

	public PropertyType getPropertType() {
		return propertType;
	}

	public void setPropertType(PropertyType propertType) {
		this.propertType = propertType;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}











	@Override
	public int hashCode() {
		return Objects.hash(email, id);
	}











	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id);
	}


	

	
}
