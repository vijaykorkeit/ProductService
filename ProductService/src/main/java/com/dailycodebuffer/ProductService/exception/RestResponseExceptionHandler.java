package com.dailycodebuffer.ProductService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.dailycodebuffer.ProductService.model.ErrorMessage;

@ControllerAdvice
public class RestResponseExceptionHandler extends ResponseEntityExceptionHandler{

	
	@ExceptionHandler(ProductServiceCustomException.class)
	public ResponseEntity<ErrorMessage> productNotFoundExceptionHandler(){
	
		ErrorMessage errorMessage = new ErrorMessage.Builder().setErrorMessage("product not found for given id")
				.setErrorCode("PRODUCT_NOT_FOUND").build();
		return new ResponseEntity<ErrorMessage>(errorMessage,HttpStatus.NOT_FOUND);
	
	}
	
}
