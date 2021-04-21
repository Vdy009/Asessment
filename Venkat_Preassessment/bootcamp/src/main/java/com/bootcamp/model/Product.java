package com.bootcamp.model;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable, Comparable<Product> {


	@JsonProperty("productId")
	private String productId; 
	
	@JsonProperty("productName")
	private String productName;
	
	@JsonProperty("unitOfMeasure")
	private String unitOfMeasure;
	
	@JsonProperty("status")
	private String status;
	
	@JsonProperty("launchDate")
	private String launchDate;
	
	private Date dateLaunch;
	
	public String getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(String launchDate) throws ParseException {
		this.launchDate = launchDate;
		this.dateLaunch = new SimpleDateFormat("yyyy-MM-dd").parse(launchDate);
	}

	@Override
	public int compareTo(Product prod) {
		
		int iRetValue = prod.getProductId().compareTo(this.getProductId());
		if(iRetValue==0) {
			iRetValue = prod.dateLaunch.compareTo(this.dateLaunch);
		}else {
		
		}
		return iRetValue;
	}

	public Product(String productId, String productName, String unitOfMeasure, String status) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.unitOfMeasure = unitOfMeasure;
		this.status = status;
	}
	
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


}
