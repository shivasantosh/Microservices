package com.product.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProdcutController {

	private static final Logger LOGGER = LogManager.getLogger(ProdcutController.class);
	
	@PostMapping("/validate/product/{productId}")
	public ResponseEntity<String> validateProduct(@PathVariable long productId){
		LOGGER.info("Checking product with productId ::"+productId);
		//mycode to be check from DB or call third party service But Let's consider error case
		return new ResponseEntity<>("not found", HttpStatus.EXPECTATION_FAILED);
	}
}
