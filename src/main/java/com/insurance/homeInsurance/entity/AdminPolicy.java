package com.insurance.homeInsurance.entity;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class AdminPolicy {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String policyName;
	private String policyDescription;
	private Integer policyDuration;
	private Double premiumAmount;
	private Boolean customPolicy = false;
	private Integer propertyAmount ;//range
    
    @ManyToMany(cascade = {CascadeType.ALL})
    private List<Feature> features = new ArrayList<>();
    
    
	public AdminPolicy() {
		super();
	}

	public List<Feature> getFeatures() {
		return features;
	}
	public AdminPolicy(Integer id, String policyName, String policyDescription, Integer policyDuration) {
	super();
	this.id = id;
	this.policyName = policyName;
	this.policyDescription = policyDescription;
	this.policyDuration = policyDuration;
}
	public AdminPolicy(Double premiumAmount, Boolean customPolicy, Integer propertyAmount, List<Feature> features) {
		super();
		this.premiumAmount = premiumAmount;
		this.customPolicy = customPolicy;
		this.propertyAmount = propertyAmount;
		this.features = features;
	}
	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getPolicyDescription() {
		return policyDescription;
	}
	public void setPolicyDescription(String policyDescription) {
		this.policyDescription = policyDescription;
	}
	public Integer getPolicyDuration() {
		return policyDuration;
	}
	public void setPolicyDuration(Integer policyDuration) {
		this.policyDuration = policyDuration;
	}
	public Double getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(Double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public Boolean getCustomPolicy() {
		return customPolicy;
	}
	public void setCustomPolicy(Boolean customPolicy) {
		this.customPolicy = customPolicy;
	}
	public Integer getPropertyAmount() {
		return propertyAmount;
	}
	public void setPropertyAmount(Integer propertyAmount) {
		this.propertyAmount = propertyAmount;
	}
    
    

    
	
}
