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

	String email;
	String password;
	
	
	
	public Admin(Integer id, String userName, String password, List<Renewal> renewalDetails,
			List<AdminPolicy> adminPolicies) {
		super();
		this.id = id;
		this.email = userName;
		this.password = password;
		
	}
	
	public Admin() {
		super();
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
