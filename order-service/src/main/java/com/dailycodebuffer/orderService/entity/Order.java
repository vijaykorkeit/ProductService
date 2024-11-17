package com.dailycodebuffer.orderService.entity;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ORDER_DETAILS")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long orderId;
	
	private long productId;
	
	@Column(name="ORDER_PRICE")
	private long orderPrice;
	
	@Column(name="QUANTITY")
	private long quantity;
	
	@Column(name="ORDER_STATUS")
	private String orderStatus;
	@Column(name="ORDER_DATE")
	private Instant orderDate;
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public long getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(long orderPrice) {
		this.orderPrice = orderPrice;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Instant getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Instant orderDate) {
		this.orderDate = orderDate;
	}
	public Order(long orderId, long productId, long orderPrice, long quantity, String orderStatus, Instant orderDate) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.orderPrice = orderPrice;
		this.quantity = quantity;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
