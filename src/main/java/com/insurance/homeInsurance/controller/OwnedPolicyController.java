package com.insurance.homeInsurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.homeInsurance.entity.OwnedPolicy;
import com.insurance.homeInsurance.exception.OwnedPolicyException;
import com.insurance.homeInsurance.service.OwnedPolicyService;

@RestController
public class OwnedPolicyController {
	
@Autowired
private OwnedPolicyService  ownedPolicyService ;
//
//@GetMapping("getownedpolicy/{id}")
//public OwnedPolicy getOwnedPolicyByCustomerId(@PathVariable ("id") Integer id ) throws OwnedPolicyException{
//	return this.ownedPolicyService.getOwnedPolicyByCustomerId(id);
//	
//}
@GetMapping("/")

public String getGreeting() {

    return "Welcome";

}

@PostMapping("/ownedpolicy/{id}")

 public OwnedPolicy createOwnedPolicyByCustomerId(@RequestBody OwnedPolicy ownedPolicy, @PathVariable("id") Integer id) throws OwnedPolicyException {

 return this.ownedPolicyService.createOwnedPolicyByCustomerId(ownedPolicy, id) ;

}

     

@GetMapping("/allownedpolicies/{custId}")

 public List<OwnedPolicy> getOwnedPolicyByCustomerId(@PathVariable("custId") Integer CustId ) throws OwnedPolicyException{

 return this.ownedPolicyService.getAllOwnedPoliciesByCustomerId(CustId);


 }
}
