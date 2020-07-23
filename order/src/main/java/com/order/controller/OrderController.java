package com.order.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.feign.service.ProductFeignService;

@RestController
public class OrderController {
	
	private static final Logger LOGGER = LogManager.getLogger(OrderController.class);

	@Autowired
	private ProductFeignService productFeignService;
	
	@PostMapping("/order/{productId}")
	public ResponseEntity<String> saveOder(@PathVariable long productId){
		LOGGER.info("validating the product");
		productFeignService.validateProduct(productId);
		return new ResponseEntity<>("success",HttpStatus.ACCEPTED);
	}
}
