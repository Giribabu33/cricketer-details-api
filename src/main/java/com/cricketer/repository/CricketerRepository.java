package com.cricketer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricketer.model.CricketerDetails;


@Repository
public interface CricketerRepository extends JpaRepository<CricketerDetails,Integer>{
	

}
