package com.insurance.homeInsurance.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feature {
	@Id
	Integer id;
	
	String featureName;
	Double percent;
	
	public Feature() {
		super();
	}
	public Feature(Integer id, String featureName, Double percent) {
		super();
		this.id = id;
		this.featureName = featureName;
		this.percent = percent;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFeatureName() {
		return featureName;
	}
	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}
	public Double getPercent() {
		return percent;
	}
	public void setPercent(Double percent) {
		this.percent = percent;
	}
	
	

}
