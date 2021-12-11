package study;

public class Dentaku {

	private int a;
	private int b;

	// 05
	public Dentaku() {
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	// 06
	public Dentaku(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int add() {
		return a + b;
	}

	public int subtract() {
		return a - b;
	}
}
