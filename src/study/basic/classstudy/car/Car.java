package study.basic.classstudy.car;

public class Car {

	// 車の生産台数 →1台1台の車に紐付かない、Carクラス自体の情報はstatic
	private static int count = 0;

	private boolean isEngineStarting = false; // エンジンが始動しているか
	private int speed = 0;
	private String color;
	private String type; // スポーツカーとか軽自動車なのか

	public String mieru;
	protected String kodomoIkaNihaMieru;
	String packageScope;

//	private Engine engine;
//	たいや

	public Car(String color, String type) {
		count++; // 作られた時（＝newした時）に、生産台数を1つ増やす

		this.type = type;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void てきとう(int a, int b) {
		// 2つの数字を受け取ってなにかする
	}

	public String getType() {
		return type;
	}

	public int getSpeed() {
		return speed;
	}

	public void speedUp() {
		speed++;
	}

	public static int getCount() {
		return count;
	}

	public void speedDown() {
		if (getSpeed() <= 0) {
			throw new RuntimeException("すでに0km以下です");
		}
		speed--;
	}

	public void startEngine() {
		isEngineStarting = true;
	}

	public boolean isEngineStarting() {
		return isEngineStarting;
	}
}
