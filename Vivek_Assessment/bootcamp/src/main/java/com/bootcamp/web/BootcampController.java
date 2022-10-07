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

	
	private final BootcampService bootcampService;
	
	@Autowired
	public BootcampController(BootcampService bootcampService) {
		this.bootcampService = bootcampService;
	}
	
	@RequestMapping (value = "/sortProducts", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<ProductList> sortProducts(@RequestBody ProductList req){
		
		return bootcampService.sortProducts(req);
	}
	
	
}
