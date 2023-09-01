package com.insurance.homeInsurance.service;


import com.insurance.homeInsurance.dto.loginDto;
import com.insurance.homeInsurance.entity.Admin;
import com.insurance.homeInsurance.exception.AdminException;

public interface AdminService {
	
	Admin addAdmin(Admin newAdmin) throws AdminException;
	Admin getAdminById(Integer id)throws AdminException;
	Boolean adminLogin(loginDto login) throws AdminException;

}
