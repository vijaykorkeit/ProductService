package com.dailycodebuffer.ProductService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.ProductService.entity.Product;
import com.dailycodebuffer.ProductService.exception.ProductServiceCustomException;
import com.dailycodebuffer.ProductService.model.ProductRequest;
import com.dailycodebuffer.ProductService.model.ProductResponse;
import com.dailycodebuffer.ProductService.repository.ProductRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Long addProduct(ProductRequest productRequest) {
		// TODO Auto-generated method stub
		Product product= new Product();
		product.setProductName(productRequest.getName());
		product.setPrice(productRequest.getPrice());
		product.setQuantity(productRequest.getQuantity());
        Product saveProduct = productRepository.save(product);
		return saveProduct.getPorductId();
	}

	@Override
	public ProductResponse getProductById(long productId) {
		// TODO Auto-generated method stub
	
	Product product=	productRepository.findById(productId).orElseThrow(()->new ProductServiceCustomException("Product not found with given id","PRODUCT_NOT_FOUND"));
		
	ProductResponse productResponse= new ProductResponse.Builder().setProductId(product.getPorductId()).setPrice(product.getPrice()).
	 setProductName(product.getProductName()).setQuantity(product.getQuantity()).build();
	 return productResponse;
	}

}
