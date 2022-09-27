package com.cricketer.service;

import org.springframework.stereotype.Service;


@Service
public interface CricketerService {
	/**
	 * declaring method here
	 * calling this method in controller class
	 * implementing this method in Imp class
	 * @param cricketerDetails 
	 */

	public String insertCricketerDetails(com.cricketer.model.CricketerDetails cricketerDetails);
	
}
