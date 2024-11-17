package com.dailycodebuffer.orderService.service;

import java.time.Instant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.orderService.entity.Order;
import com.dailycodebuffer.orderService.model.OrderRequest;
import com.dailycodebuffer.orderService.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

    private static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public long placeOrder(OrderRequest orderRequest) {
		// TODO Auto-generated method stub
		logger.info("implenting the place order in the OrderService impl");
		Order order= new Order();
		order.setProductId(orderRequest.getProductId());
		order.setQuantity(orderRequest.getQuantity());
		order.setOrderDate(Instant.now());
	order.setOrderPrice(orderRequest.getTotalAmount());
		Order savedOrder = orderRepository.save(order);
		logger.info("order place sucessfully with " +savedOrder.getProductId());
		return savedOrder.getProductId();
	}

}
