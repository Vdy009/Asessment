package com.bootcamp.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.model.Product;
import com.bootcamp.model.ProductList;
import com.bootcamp.service.BootcampService;


@RestController
public class BootcampController {

	
	private final BootcampService BootcampService;
	
	@Autowired
	public BootcampController(BootcampService BootcampService) {
		this.BootcampService = BootcampService;
	}
	
	@RequestMapping (value = "/createProduct", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Product> createProduct(@RequestBody Product req){
		
		return BootcampService.createProduct(req);
	}
	
	@RequestMapping (value = "/sortProducts", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<ProductList> sortProducts(@RequestBody ProductList req){
		
		return BootcampService.sortProducts(req);
	}
	
	
	//http://localhost:8080/hello?name=
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	return String.format("Hello %s!", name);
	}
	
}
