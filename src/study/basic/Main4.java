package study.basic;

public class Main4 {

	private String instanceHensu;
	private static String classHensu;

	public static void main(String args[]) {
		// 配列
		String[] a = new String[3];
		a[0] = "0ばんめ";
		a[1] = "1ばんめ";
		a[2] = "2ばんめ";

		System.out.println(a[0]);

		// ["0ばんめ", "1ばんめ", "2ばんめ"]

		// 配列の中身を順に出力
		String[] animals = { "cat", "dog", "bird" };
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
	}
}
