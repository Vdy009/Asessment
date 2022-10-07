package data;


import java.util.ArrayList;
import java.util.List;

import model.Product;


/**
 * Contains all the required data
 * 
 * @author Admin
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
		Product product1 = createProduct("Prod1","Shirt","EACH");
		productList.add(product1);
		
		Product product2 = createProduct("Prod2","Trousers","EACH");
		productList.add(product1);
		
		Product product3 = createProduct("Prod3","Tie","EACH");
		productList.add(product1);
	}



	/**
	 * Creates a new product with status=Exists. 
	 * 
	 * @param productId
	 * @param productName
	 * @param unitOfMeasure
	 * @return
	 */
	private static Product createProduct(String productId, String productName, String unitOfMeasure) {
		
		return new Product(productId, productName, unitOfMeasure, "Exists");
	}

	public static Product createProduct(Product req) {
		
		Product product1 = createProduct(req.getProductId(), req.getProductName(), req.getUnitOfMeasure());
		product1.setStatus("Exists");
		productList.add(product1);
		return null;
	}
}
