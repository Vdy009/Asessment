package com.bootcamp.service;

import org.springframework.http.ResponseEntity;

import com.bootcamp.model.Product;
import com.bootcamp.model.ProductList;


public interface BootcampService {

	ResponseEntity<ProductList> sortProducts(ProductList req);

}