package com.arc.demo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestControllerClass {
	private static final Logger logger=LoggerFactory.getLogger(RestControllerClass.class);
	
	
	
	@GetMapping("/greet")
	public String getMessage() {
		logger.info("Inside greet method");
		String msg="Greetings of the day ";
		logger.info("Processed greet method");
		return msg;
	}

}
