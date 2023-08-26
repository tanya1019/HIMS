package com.insurance.homeInsurance.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Admin {
	
	@Id
	Integer id;
	
	String userName;
	String password;
	
	@OneToMany(cascade=CascadeType.ALL)
	List<Renewal> renewalDetails = new ArrayList<>();
	
	@OneToMany(cascade=CascadeType.ALL)
	List<AdminPolicy> adminPolicies = new ArrayList<>();
	
	
	
	
	
	public Admin(Integer id, String userName, String password, List<Renewal> renewalDetails,
			List<AdminPolicy> adminPolicies) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.renewalDetails = renewalDetails;
		this.adminPolicies = adminPolicies;
	}


	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}



	public List<Renewal> getRenewalDetails() {
		return renewalDetails;
	}


	@Override
	public String toString() {
		return "Admin [id=" + id + ", userName=" + userName + ", password=" + password + ", renewalDetails="
				+ renewalDetails + ", adminPolicies=" + adminPolicies + "]";
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


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
