package com.dailycodebuffer.orderService.service;

import com.dailycodebuffer.orderService.model.OrderRequest;

public interface OrderService {

	long placeOrder(OrderRequest orderRequest);

}
