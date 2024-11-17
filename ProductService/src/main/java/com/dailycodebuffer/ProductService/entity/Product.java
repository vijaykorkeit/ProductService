package com.dailycodebuffer.ProductService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long porductId;
	
	@Column(name="PRODUCT_NAME")
	private String productName;
	
	@Column(name="PRICE")
	private long price;
	
	@Column(name="QUANTITY")
	private long quantity;

	public long getPorductId() {
		return porductId;
	}

	public void setPorductId(long porductId) {
		this.porductId = porductId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
