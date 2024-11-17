package com.dailycodebuffer.ProductService.controller;

import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.ProductService.model.ProductRequest;
import com.dailycodebuffer.ProductService.model.ProductResponse;
import com.dailycodebuffer.ProductService.service.ProductService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/product")
public class PorductController {


@Autowired
	  private ProductService productService;
	
	@PostMapping
	public ResponseEntity<Long> addProduct(@RequestBody  ProductRequest productRequest){
	Long productId=	productService.addProduct(productRequest);
	//log.info("This is an INFO log message using Log4j2");
	return new ResponseEntity<Long>(productId, HttpStatus.CREATED) ;
	}
		
	@GetMapping("/{id}")
	public ResponseEntity<ProductResponse> getProductById( @PathVariable("id") long productId ){
		ProductResponse productResponse=   productService.getProductById(productId);
		return new ResponseEntity<ProductResponse>(productResponse, HttpStatus.OK);
		
	}
}
