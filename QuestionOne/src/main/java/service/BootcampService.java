package service;


import org.springframework.http.ResponseEntity;

import model.Product;
import model.ProductList;


public interface BootcampService {
	
	ResponseEntity<Product> createProduct(Product req);

	ResponseEntity<ProductList> sortProducts(ProductList req);

}