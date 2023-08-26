package com.insurance.homeInsurance.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	
	@Id
	Integer id;
	
	String contactNumber;
	String email;
	String name;
	String password;
	PropertyType propertType;
	
	
	@OneToMany(cascade = {CascadeType.ALL})
	List<OwnedPolicy> ownedPolicy = new ArrayList<>();
	
	@OneToMany(cascade = {CascadeType.ALL})
	List<Property> propertyDetails = new ArrayList<>();
	
	
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	


	public Customer(Integer id, String contactNumber, String email, String name, String password, 	PropertyType propertType,
			List<OwnedPolicy> ownedPolicy, List<Property> propertyDetails) {
		super();
		this.id = id;
		this.contactNumber = contactNumber;
		this.email = email;
		this.name = name;
		this.password = password;
		this.propertType = propertType;
		this.ownedPolicy = ownedPolicy;
		this.propertyDetails = propertyDetails;
	}





	@Override
	public String toString() {
		return "Customer [id=" + id + ", contactNumber=" + contactNumber + ", email=" + email + ", name=" + name
				+ ", password=" + password + ", type=" + propertType + ", ownedPolicy=" + ownedPolicy + ", propertyDetails="
				+ propertyDetails + "]";
	}





	public List<OwnedPolicy> getOwnedPolicy() {
		return ownedPolicy;
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


	

	
}
