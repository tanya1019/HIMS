package com.insurance.homeInsurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.homeInsurance.dto.loginDto;
import com.insurance.homeInsurance.entity.Admin;
import com.insurance.homeInsurance.exception.AdminException;

import com.insurance.homeInsurance.service.AdminService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@PostMapping("/addAdmin")
	public Admin addAdmin(@RequestBody Admin newAdmin) throws AdminException  {
		
		try {
			return this.adminService.addAdmin(newAdmin);
		}catch (AdminException e) {
			throw e;
		}
		
	}
	
	@GetMapping("/admin/{id}")
	 public Admin getCustomerById(@PathVariable("id") Integer id) throws AdminException {

		 try{
			 return this.adminService.getAdminById(id);
		}catch (AdminException e) {
				throw e;
		} 
	 }
	
	@PostMapping("/adminLogin")
	 public Boolean login(@RequestBody loginDto login) throws AdminException {

		 return this.adminService.adminLogin(login);
	 }

	 // this is a commit

}


