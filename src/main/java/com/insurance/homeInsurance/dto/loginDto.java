package com.insurance.homeInsurance.dto;



public class loginDto {
	
	private String email;
	private String password;
	
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
	
	public loginDto(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	public loginDto() {
		super();
	}
	@Override
	public String toString() {
		return "loginDto [email=" + email + ", password=" + password + "]";
	}

}
