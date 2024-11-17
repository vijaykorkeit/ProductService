package com.dailycodebuffer.orderService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.orderService.model.OrderRequest;
import com.dailycodebuffer.orderService.service.OrderService;

@RequestMapping("/order")
@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping
	public ResponseEntity<Long> placeOrder( @RequestBody  OrderRequest orderRequest){
		
		  long orderId=  orderService.placeOrder(orderRequest);
		  return new ResponseEntity<Long>(orderId,HttpStatus.CREATED);
	}
}
