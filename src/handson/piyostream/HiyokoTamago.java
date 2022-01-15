package handson.piyostream;

public class HiyokoTamago {

	private int number;

	private Hiyoko hiyoko;

	public HiyokoTamago(int number, Hiyoko hiyoko) {
		this.hiyoko = hiyoko;
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public Hiyoko getHiyoko() {
		return hiyoko;
	}
}