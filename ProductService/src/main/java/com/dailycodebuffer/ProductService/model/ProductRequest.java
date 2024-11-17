package com.dailycodebuffer.ProductService.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ProductRequest {

	private String name;
	private long price;
	private long quantity;
	
	
	public ProductRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	
	
	
}
