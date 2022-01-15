package handson.piyostream;

import java.util.Optional;

public class Tamago {

	private Optional<Hiyoko> hiyoko;

	private int number;

	public Tamago(int number) {
		hiyoko = Optional.empty();
		this.number = number;
	}

	public Tamago(int number, Hiyoko hiyoko) {
		this.hiyoko = Optional.of(hiyoko);
		this.number = number;
	}

	public Optional<Hiyoko> getHiyoko() {
		return hiyoko;
	}

	public int getNumber() {
		return number;
	}
}