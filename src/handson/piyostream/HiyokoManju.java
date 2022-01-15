package handson.piyostream;

import java.util.Random;

public class HiyokoManju {

	private String name;

	private String aji;

	public HiyokoManju(Hiyoko hiyoko) {
		this.name = hiyoko.getName();
		if (new Random().nextInt() % 2 == 0) {
			aji = "うまい";
		} else {
			aji = "まずい";
		}
	}

	public String getName() {
		return name;
	}

	public String getAji() {
		return aji;
	}
}