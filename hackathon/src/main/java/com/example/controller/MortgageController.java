package com.example.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apicall.APICall;
import com.example.dto.UserDetailsDTO;
import com.example.service.MortgageCreationService;

@RestController
@CrossOrigin("*")
public class MortgageController {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(MortgageController.class);
	
	
	
	@Autowired
	private MortgageCreationService mortgageCreationService;
	
	@PostMapping("/userdetails")
	private UserDetailsDTO AddMortgageUser(@RequestBody UserDetailsDTO userdetailsdto) 
	{
		UserDetailsDTO userdetails=mortgageCreationService.AddMortgageUsers(userdetailsdto);
		return userdetails;
	}
	

}
