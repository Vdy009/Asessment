package com.bootcamp.model;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Product pojo class
 * 
 * @author Vivek
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable, Comparable<Product> {

	private String productId;

	private String productName;

	private String unitOfMeasure;

	private Date launchDate;
	
	public Product() {

	}

	public Product(String productId, String productName, String unitOfMeasure, Date launchDate) {

		this.productId = productId;
		this.productName = productName;
		this.unitOfMeasure = unitOfMeasure;
		this.launchDate = launchDate;
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

	public Date getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(Date launchDate) {
		this.launchDate = launchDate;
	}



	@Override
	public int compareTo(Product prod) {

		int iRetValue = prod.getProductId().compareTo(this.getProductId());
		if (iRetValue == 0) {
			iRetValue = prod.launchDate.compareTo(this.launchDate);
		} else {

		}
		return iRetValue;
	}
	
	public static Date parseDate(String date) {
		
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(date);
		}catch (ParseException e) {
			return null;
		}
	}

}
