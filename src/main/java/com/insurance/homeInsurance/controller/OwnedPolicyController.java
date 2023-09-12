package com.insurance.homeInsurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.insurance.homeInsurance.entity.OwnedPolicy;

import com.insurance.homeInsurance.exception.CustomerException;

import com.insurance.homeInsurance.service.OwnedPolicyService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OwnedPolicyController {
	
@Autowired
OwnedPolicyService  ownedPolicyService ;
//
//@GetMapping("getownedpolicy/{id}")
//public OwnedPolicy getOwnedPolicyByCustomerId(@PathVariable ("id") Integer id ) throws OwnedPolicyException{
//	return this.ownedPolicyService.getOwnedPolicyByCustomerId(id);
//	
//}


@PostMapping("/ownedpolicy/{custid}/{adminPolicyId}")

 public OwnedPolicy createOwnedPolicyByCustomerId(@RequestBody OwnedPolicy ownedPolicy, @PathVariable("custid") Integer custid, @PathVariable("adminPolicyId") Integer adminPolicyId) throws CustomerException {


 return this.ownedPolicyService.createOwnedPolicyByCustomerId(ownedPolicy, custid, adminPolicyId) ;

}

     

@GetMapping("/ownedpolicies/{custId}")

 public List<OwnedPolicy> getOwnedPolicyByCustomerId(@PathVariable("custId") Integer CustId ) throws CustomerException{

 return this.ownedPolicyService.getAllOwnedPoliciesByCustomerId(CustId);


 }
}
