package com.cricketer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cricketer.repository.CricketerRepository;

@Service
public class CricketerServiceImpl {
	private static final Logger logger = LoggerFactory.getLogger(CricketerServiceImpl.class);

	@Autowired(required = false)
	private CricketerRepository cricketerRepository;
	
	public String insertCricketerDetails(com.cricketer.model.CricketerDetails cricketerDetails) {
		logger.info("Cricketer Details in the Service Layer : "+cricketerDetails);
		
		cricketerRepository.save(cricketerDetails);
		return "Cricketer bio is updated successfully";
			
		}
	
}
