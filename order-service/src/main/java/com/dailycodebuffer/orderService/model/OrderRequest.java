package com.dailycodebuffer.orderService.model;

import java.time.Instant;

import jakarta.persistence.Column;

public class OrderRequest {
	
	

	private long productId;
	private String productName;
	private long quantity;
	private PaymentMode paymentMode;
	private long totalAmount;
	
	
	public OrderRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderRequest(long productId, String productName, long quantity, PaymentMode paymentMode, long totalAmount) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.paymentMode = paymentMode;
		this.totalAmount = totalAmount;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public PaymentMode getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}
	public long getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}

	
	
}
