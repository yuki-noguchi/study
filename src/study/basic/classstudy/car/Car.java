package study.basic.classstudy.car;

/**
 * 車を表すクラス
 * 
 * @author yuki
 */
public class Car {

	// 車の生産台数 →1台1台の車に紐付かない、Carクラス自体の情報はstatic
	private static int count = 0;

	private boolean isEngineStarting = false; // エンジンが始動しているか
	private int speed = 0; // 現在のスピード
	private String color; // 色
	private String type; // スポーツカーとか軽自動車なのか

	// コンストラクタ
	// newした時に呼ばれるメソッド
	public Car(String color, String type) {
		count++; // 作られた時（＝newした時）に、生産台数を1つ増やす

		// タイプ、色を更新
		this.type = type;
		this.color = color;
	}

	public String getColor() {
		return color;
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
		// スピードが0以下だったら例外を投げる
		// 例外とは、エラーだと解釈してOK
		// 処理をそこでストップする
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
