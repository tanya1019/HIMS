package com.insurance.homeInsurance.service;


import com.insurance.homeInsurance.dto.loginDto;
import com.insurance.homeInsurance.entity.Admin;
import com.insurance.homeInsurance.exception.CustomerException;

public interface AdminService {
	
	Admin addAdmin(Admin newAdmin) throws CustomerException;
	Admin getAdminById(Integer id)throws CustomerException;
	Boolean adminLogin(loginDto login) throws CustomerException;

}
