package com.insurance.homeInsurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.insurance.homeInsurance.service.EmailSenderService;


@SpringBootApplication
public class HomeInsuranceApplication {
	
	@Autowired
	EmailSenderService senderService;

	public static void main(String[] args) {
		
		SpringApplication.run(HomeInsuranceApplication.class, args);
	}
	
//	@EventListener(ApplicationReadyEvent.class)
//	
//	public void sendEmail() {
//		senderService.sendEmail("tyagihimank28@gmail.com", "Hello Himank", "This is the test mail send from Anish(Bajaj)");
//	}
	

}
