package com.bootcamp.data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bootcamp.model.Product;

/**
 * Contains all the required data
 * 
 * @author Vivek
 *
 */

public class Data {

	static List<Product> productList = new ArrayList<>();

	public static List<Product> getProductList() {
		return productList;
	}

	public static void setProductList(List<Product> productList) {
		Data.productList = productList;
	}

	/**
	 * Loads the data during the application startup.
	 */
	public static void loadData() {
		Product product1 = createProduct("Prod1", "Shirt", "EACH", Product.parseDate("2021-02-21"));
		productList.add(product1);

		Product product2 = createProduct("Prod2", "Trousers", "EACH", Product.parseDate("2021-02-19"));
		productList.add(product1);

		Product product3 = createProduct("Prod3", "Tie", "EACH", Product.parseDate("2021-02-22"));
		productList.add(product3);
		
		Product product4 = createProduct("Prod4", "Tie", "EACH", Product.parseDate("2021-02-24"));
		productList.add(product4);
	}

	/**
	 * Creates a new product with status=Exists.
	 * 
	 * @param productId
	 * @param productName
	 * @param unitOfMeasure
	 * @return
	 */
	private static Product createProduct(String productId, String productName, String unitOfMeasure, Date launchDate) {

		return new Product(productId, productName, unitOfMeasure, launchDate);
	}

	public static Product createProduct(Product req) {

		Product product1 = createProduct(req.getProductId(), req.getProductName(), req.getUnitOfMeasure(),
				req.getLaunchDate());
		productList.add(product1);
		return null;
	}
}
