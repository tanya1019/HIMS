package com.insurance.homeInsurance.advice;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;

 

import com.insurance.homeInsurance.exception.AdminException;

import com.insurance.homeInsurance.exception.AdminPolicyException;

import com.insurance.homeInsurance.exception.ClaimException;

import com.insurance.homeInsurance.exception.CustomerException;

import com.insurance.homeInsurance.exception.FeatureException;

import com.insurance.homeInsurance.exception.OwnedPolicyException;

import com.insurance.homeInsurance.exception.PaymentException;

import com.insurance.homeInsurance.exception.PropertyException;

import com.insurance.homeInsurance.exception.RenewalException;

public class HomeInsuranceAdvice {

	
	@ExceptionHandler(AdminException.class)

    public ResponseEntity<String> handleAdminException(AdminException adminException ){

        

        return new ResponseEntity<String>(adminException.getMessage(),HttpStatus.BAD_REQUEST);

        

    }

    @ExceptionHandler(AdminPolicyException.class)

    public ResponseEntity<String> handleAdminPolicyException(AdminPolicyException adminPolicyException ){

        

        return new ResponseEntity<String>(adminPolicyException.getMessage(),HttpStatus.BAD_REQUEST);

        

    }

    @ExceptionHandler(ClaimException.class)

    public ResponseEntity<String> handleClaimException(ClaimException claimException ){

        

        return new ResponseEntity<String>(claimException.getMessage(),HttpStatus.BAD_REQUEST);

        

    }

    

    @ExceptionHandler(CustomerException.class)

    public ResponseEntity<String> handleCustomerException(CustomerException customerException ){

        

        return new ResponseEntity<String>(customerException.getMessage(),HttpStatus.BAD_REQUEST);

        

    }

    

    @ExceptionHandler(FeatureException.class)

    public ResponseEntity<String> handleFeatureException(FeatureException featureException ){

        

        return new ResponseEntity<String>(featureException.getMessage(),HttpStatus.BAD_REQUEST);

        

    }

    

    

    @ExceptionHandler(OwnedPolicyException.class)

    public ResponseEntity<String> handleOwnedPolicyExceptionn(OwnedPolicyException ownedPolicyException ){

        

        return new ResponseEntity<String>(ownedPolicyException.getMessage(),HttpStatus.BAD_REQUEST);

        

    }

    

    

    @ExceptionHandler(PaymentException.class)

    public ResponseEntity<String> handlePaymentException(PaymentException paymentException ){

        

        return new ResponseEntity<String>(paymentException.getMessage(),HttpStatus.BAD_REQUEST);

        

    }

    

    

    @ExceptionHandler(PropertyException.class)

    public ResponseEntity<String> handlePropertyException(PropertyException propertyException ){

        

        return new ResponseEntity<String>(propertyException.getMessage(),HttpStatus.BAD_REQUEST);

        

    }

    

    

    @ExceptionHandler(RenewalException.class)

    public ResponseEntity<String> handleRenewalException(RenewalException renewalException ){

        

        return new ResponseEntity<String>(renewalException.getMessage(),HttpStatus.BAD_REQUEST);

        

    }

    

    
}
