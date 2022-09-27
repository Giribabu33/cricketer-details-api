package com.cricketer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cricketer.model.CricketerDetails;
import com.cricketer.service.CricketerService;

@RestController
public class CricketerController {
	
	private static final Logger logger = LoggerFactory.getLogger(CricketerController.class);
	
	@Autowired(required = false)
	private CricketerService cricketerService;
	
	@PostMapping("/cricketer-bio")
	public String addCandidateDetails(@RequestBody CricketerDetails cricketerDetails) {
		
		logger.info("Candidate original details are :" +cricketerDetails);
		String response = "Congrats";
		return response;
		
	}

	@PostMapping("/plus_cricketer_bio")
	public String insertCricketerDetails(@RequestBody CricketerDetails cricketerDetails) {
		logger.info("Cricketer bio details are :" +cricketerDetails);
		
		String response=cricketerService.insertCricketerDetails(cricketerDetails);
		
		return response;
	}
	
}
