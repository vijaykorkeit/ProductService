package com.dailycodebuffer.ProductService.exception;

public class ProductServiceCustomException extends RuntimeException {

	
	String errorcode;
	
	public ProductServiceCustomException(String message, String errorcode) {
		super(message);
		this.errorcode=errorcode;
	}
}
