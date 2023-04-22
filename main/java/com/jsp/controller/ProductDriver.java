package com.jsp.controller;

import com.jsp.productcustomer.dto.Product;
import com.jsp.service.ProductService;

public class ProductDriver {
	
	public static void main(String[] args) {
	Product product =new Product();
	product.setName("Moblie");
	product.setBrand("Iphone");
	product.setPaid("paid");
	
	
	ProductService productService=new ProductService();
	Product product2 = productService.saveProduct(product);
	if(product2!=null) {
		System.out.println(product2.getId()+"saved succesfully");
	
	}
	
	
	
	}

}
