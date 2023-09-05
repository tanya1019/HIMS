package com.insurance.homeInsurance.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Admin {
	
	//Data Members--Private 
	@Id
	private Integer id;

	private String email;
	private String password;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Renewal> renewalDetails = new ArrayList<>();
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<AdminPolicy> adminPolicies = new ArrayList<>();
	
	public Admin(Integer id, String userName, String password, List<Renewal> renewalDetails,
			List<AdminPolicy> adminPolicies) {
		super();
		this.id = id;
		this.email = userName;
		this.password = password;
		this.renewalDetails = renewalDetails;
		this.adminPolicies = adminPolicies;
	}
	
	public Admin() {
		super();
	}
	
	public List<Renewal> getRenewalDetails() {
		return renewalDetails;
	}

	public void setRenewalDetails(List<Renewal> renewalDetails) {
		this.renewalDetails = renewalDetails;
	}


	public List<AdminPolicy> getAdminPolicies() {
		return adminPolicies;
	}


	public void setAdminPolicies(List<AdminPolicy> adminPolicies) {
		this.adminPolicies = adminPolicies;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
