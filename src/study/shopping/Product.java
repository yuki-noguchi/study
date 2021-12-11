package study.shopping;

public class Product {

	private static int count = 0;

	private String name;
	private int price;

	public Product(String name, int price) {
		count++;

		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}
}
