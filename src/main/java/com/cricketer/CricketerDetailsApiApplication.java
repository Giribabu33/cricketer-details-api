package com.cricketer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

//import com.cricketer.model.CricketerDetails;

@Component
@SpringBootApplication
//@EnableJpaRepositories(basePackageClasses = CricketerDetails.class)
public class CricketerDetailsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricketerDetailsApiApplication.class, args);
	}

}
