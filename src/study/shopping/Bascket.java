package study.shopping;

import java.util.ArrayList;
import java.util.List;

public class Bascket {

	private List<Product> products = new ArrayList<>();

	public void add(Product product) {
		products.add(product);
	}

	public List<Product> getProducts() {
		return products;
	}
}
