package study.basic;

public class FizzBuzz {

	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++) {
			if (i % (3 * 5) == 0) { // 3でも5でも割り切れる
				System.out.println("fizzbuzz");
			} else if (i % 3 == 0) { // 3で割り切れる
				System.out.println("fizz");
			} else if (i % 5 == 0) { // 5で割り切れる
				System.out.println("buzz");
			} else { // そうでない場合
				System.out.println("野口" + i);
			}
		}
	}
}
