package com.jsp.service;

import com.jsp.productcustomer.dao.ProductDao;
import com.jsp.productcustomer.dto.Product;

public class ProductService {
	
	ProductDao productDao=new ProductDao();
	
	
	public Product saveProduct(Product product) {
		if(product!=null) {
			product.setPaid("Unpaid");
		}
		return productDao.saveProduct(product);
	}
	
	public Product getProductById(int id) {
		if(id>0) {
			return productDao.getProductById(id);
			
		}
		return null;
	}
	
	public Product updateProductByName(String name,int id) {
		Product p1= productDao.getProductById(id);
		p1.setName(name);
		return productDao.updateProduct(p1);
	}
	
	public Product updateProductByBrand(String brand,int id ) {
		Product p2=productDao.getProductById(id);
		p2.setBrand(brand);
		return productDao.updateProduct(p2);
		
		
	}
	public Product deleteProductByname(String name,int id) {
		Product p1= productDao.getProductById(id);
		p1.setName(name);
		return productDao.updateProduct(p1);

}
}
