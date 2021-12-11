package handson.answer.shopping;

public class Register {

	private Bascket bascket;

	public void putBascket(Bascket bascket) {
		this.bascket = bascket;
	}

	public int calcAmount() {
		return bascket.getProducts().stream().map(Product::getPrice).mapToInt(price -> price).sum();
	}
}
