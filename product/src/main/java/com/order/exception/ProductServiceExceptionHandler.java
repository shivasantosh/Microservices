package com.order.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ProductServiceExceptionHandler {

	@ExceptionHandler(ProductNotFoundException.class)
    public @ResponseBody ResponseEntity<ErrorDetails> invalidRequestException(ProductNotFoundException ex) {
		ErrorDetails errorDetails = new ErrorDetails(ex.getErrorMessage(), ex.getErrorCode());
        return new ResponseEntity<>(errorDetails, HttpStatus.EXPECTATION_FAILED);
    }
}
