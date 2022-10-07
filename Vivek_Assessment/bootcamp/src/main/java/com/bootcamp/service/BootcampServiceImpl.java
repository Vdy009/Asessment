package com.bootcamp.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bootcamp.data.Data;
import com.bootcamp.model.Product;
import com.bootcamp.model.ProductList;


@Service
public class BootcampServiceImpl implements BootcampService{

	@Autowired
	public BootcampServiceImpl() {

	}

	@Override
	public ResponseEntity<ProductList> sortProducts(ProductList req) {
        List<Product> sortedList = req.getProductList().stream()
                .sorted()
                .collect(Collectors.toList());
        req.setProductList(sortedList);
        
		return ResponseEntity.status(HttpStatus.OK).body(req);
	}
    
}
