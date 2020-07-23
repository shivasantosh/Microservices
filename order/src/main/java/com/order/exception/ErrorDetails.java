package com.order.exception;

import java.io.Serializable;

public class ErrorDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1628192278348242403L;
	private String errorMessage;
	private String errorCode;
	
	public ErrorDetails(String errorMessage, String errorCode) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public String getErrorCode() {
		return errorCode;
	}
	
}
