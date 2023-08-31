package com.insurance.homeInsurance.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.homeInsurance.dao.AdminRepository;
import com.insurance.homeInsurance.dto.loginDto;
import com.insurance.homeInsurance.entity.Admin;
import com.insurance.homeInsurance.exception.CustomerException;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepo;
	
	
	@Override
	public Admin addAdmin(Admin newAdmin) throws CustomerException {
		Optional<Admin> adminOpt = this.adminRepo.findById(newAdmin.getId());
		if(adminOpt.isPresent()) {
			throw new CustomerException("Admin id already exist");
		}
			return this.adminRepo.save(newAdmin);
	}


	@Override
	public Admin getAdminById(Integer id) throws CustomerException {
		
		Optional<Admin>adminOpt = this.adminRepo.findById(id);
		if(!adminOpt.isPresent())
			throw new CustomerException("Admin Not Found for id: "+id);
		return adminOpt.get();
	
	}
	
	
	@Override
	public Boolean adminLogin(loginDto login) throws CustomerException {
		
		Optional<Admin>adminOpt = (this.adminRepo).findByEmail(login.getEmail());
		
		if(!adminOpt.isPresent()) {
			throw new CustomerException("Admin not found");	
		}
		Admin admin = adminOpt.get();
		
		if(!admin.getPassword().equals(login.getPassword())) {
			throw new CustomerException("Invalid password");
		}
		return true;

	}
}