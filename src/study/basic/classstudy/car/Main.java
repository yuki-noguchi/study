package study.basic.classstudy.car;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("ブルー", "セダン");

		System.out.println(car.getColor());
		System.out.println(car.getType());

		String mieru = car.mieru;

		if (car.isEngineStarting()) {
			System.out.println("エンジンは起動しています。");
		}

		car.startEngine();
		if (car.isEngineStarting()) {
			System.out.println("エンジンは起動しています。");
		}

		car.speedUp();
		car.speedUp();
		car.speedUp();
		System.out.println(car.getSpeed()); // -> 3と出力されるはず
		car.speedDown();
		car.speedDown();
		car.speedDown();
//		car.speedDown();
		System.out.println(car.getSpeed()); // -> 0と出力されるはず

		System.out.println(Car.getCount()); // -> 1と出力される
		new Car("レッド", "軽自動車");
		System.out.println(Car.getCount()); // -> 2と出力される
	}
}
