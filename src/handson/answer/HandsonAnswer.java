package handson.answer;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import handson.answer.nintendoswitch.Gamesoft;
import handson.answer.nintendoswitch.NintendoSwitch;
import handson.answer.shopping.Bascket;
import handson.answer.shopping.Product;
import handson.answer.shopping.Register;

public class HandsonAnswer {

	// ===================================================================================
	// メソッドを作る
	// ============
	@Test
	public void want01_二つの数字を渡したらそれらを足し算して結果を返してくれるメソッドがほしいな() {
		// ほしいな詳細
		// ・結果を標準出力してほしいな
		System.out.println(add(100, 200));
		System.out.println(add(10, 2));
		System.out.println(add(12, 1));
	}

	// ↓↓↓足し算のメソッドはここに書いてね↓↓↓
	public int add(int a, int b) {
		return a + b;
	}
	// ↑↑↑足し算のメソッドはここに書いてね↑↑↑

	@Test
	public void want02_二つの数字を渡したらそれらを引き算して結果を返してくれるメソッドがほしいな() {
		// ほしいな詳細
		// ・結果を標準出力してほしいな
	}

	// ↓↓↓引き算のメソッドはここに書いてね↓↓↓

	// ↑↑↑引き算のメソッドはここに書いてね↑↑↑

	@Test
	public void want03_二つの数字を渡したらそれらを割り算して結果を返してくれるメソッドがほしいな() {
		// ほしいな詳細
		// ・割り算の結果は少数第３位で四捨五入してほしいな
		// ・1 / 3 の結果がわかるとうれしいな
		// ・結果を標準出力してほしいな
		System.out.println(devide(new BigDecimal("1"), new BigDecimal("3")));
	}

	// ↓↓↓割算のメソッドはここに書いてね↓↓↓
	public BigDecimal devide(BigDecimal a, BigDecimal b) {
		return a.divide(b, 2, RoundingMode.HALF_UP);
	}
	// ↑↑↑割算のメソッドはここに書いてね↑↑↑

	// ===================================================================================
	// クラスを作る
	// ==========
	@Test
	public void want04_Dentakuクラスがほしいな() {
		// ほしいな詳細
		// ・study.dentakuのパッケージ内に作ってほしいな
		// ・作ったDentakuクラスのインスタンスを作って変数に入れてほしいな
		Dentaku dentaku = new Dentaku();
	}

	@Test
	public void want05_すでにつくった足し算メソッドと引き算メソッドをDentakuクラスにも作ってほしいな() {
		// ほしいな詳細
		// ・Dentakuクラスに作ったそれぞれのメソッドを使って、計算結果を標準出力してほしいな
		Dentaku dentaku = new Dentaku();
		System.out.println(dentaku.add(1, 1));
		System.out.println(dentaku.subtract(1, 1));
	}

	@Test
	public void want06_Dentakuクラスは作られた瞬間に計算に使う二つの数字を保持できるようになっていてほしいな() {
		// ほしいな詳細
		// ・Dentakuクラスのインスタンスを作って変数に入れてほしいな
		Dentaku dentaku = new Dentaku(1, 1);
	}

	@Test
	public void want07_足し算と引き算は保持している数字を使うようにしてほしいな() {
		// ほしいな詳細
		// ・それぞれのメソッドを使って、計算結果を標準出力してほしいな
		Dentaku dentaku = new Dentaku(1, 1);
		System.out.println(dentaku.add());
		System.out.println(dentaku.subtract());
	}

	// ===================================================================================
	// CollectionやMapを扱う
	// ====================
	@Test
	public void want08_ニンテンドースイッチのソフトのタイトルのリストがほしいな() {
		// ほしいな詳細
		// ・リストの中には "スプラトゥーン"、"ゼルダの伝説"、"マリオオデッセイ"が入っていてほしいな
		// ・作ったリストの中身を一つずつ標準出力してほしいな
		List<String> gameSoftList = new ArrayList<>();
		gameSoftList.add("スプラトゥーン");
		gameSoftList.add("ゼルダの伝説");
		gameSoftList.add("マリオオデッセイ");

		gameSoftList.forEach(System.out::println);
	}

	@Test
	public void want09_ニンテンドースイッチのソフトのタイトルと感想のマップがほしいな() {
		// ほしいな詳細
		// ・"スプラトゥーン: なかなか勝てない。悔しい！けどおもしろい！"みたいになっていてほしいな
		// ・"スプラトゥーン"、"ゼルダの伝説"、"マリオオデッセイ"でそれぞれタイトルと感想のマップを作って、それぞれの感想を標準出力してほしいな

		Map<String, String> gameImpressionMap = new HashMap<>();
		gameImpressionMap.put("スプラトゥーン", "なかなか勝てない。悔しい！けどおもしろい！");
		gameImpressionMap.put("ゼルダの伝説", "ゼルダかわゆす");
		gameImpressionMap.put("マリオオデッセイ", "ﾌｯﾌｰ↑↑");

		gameImpressionMap.values().forEach(System.out::println);
	}

	// ===================================================================================
	// クラスを扱う 基本編
	// ================
	@Test
	public void want10_ゲームソフトクラスがほしいな() {
		// ほしいな詳細
		// ・study.nintendoswitchのパッケージ内に作ってほしいな
		// ・ゲームソフトクラスは、「タイトル」、「ジャンル」、「感想」を保持できるようになっていてほしいな
		Gamesoft gamesoft = new Gamesoft();
	}

	@Test
	public void want11_タイトルとジャンルと感想をそれぞれセットしてほしいな() {
		// ほしいな詳細
		// ・ゲームソフトクラスのインスタンスを作った瞬間にセットされるようになっていてほしいな
		// セットする内容は↓がいいな
		// タイトル：スプラトゥーン
		// ジャンル：シューティング
		// 感想：おもしろい！
		// ・セットした内容はそれぞれ標準出力してほしいな
		Gamesoft gamesoft = new Gamesoft("スプラトゥーン", "シューティング", "おもしろい！");
		System.out.println(gamesoft.getTitle());
		System.out.println(gamesoft.getGenre());
		System.out.println(gamesoft.getImpression());
	}

	@Test
	public void want12_ゲームソフトクラスは自分が何回作られたのかを分かるようになっていてほしいな() {
		// ほしいな詳細
		// ・ゲームソフトを何個か作って、作られた回数がちゃんと数えられることを標準出力で確認してほしいな

		new Gamesoft("スプラトゥーン", "シューティング", "おもしろい！");
		new Gamesoft("スプラトゥーン", "シューティング", "おもしろい！");
		new Gamesoft("スプラトゥーン", "シューティング", "おもしろい！");
		System.out.println(Gamesoft.getCount());
	}

	@Test
	public void want13_ゲームソフトのリストがほしいな() {
		// ほしいな詳細
		// ・ゲームソフトを何個か作って、それをリストにしてほしいな
		// ・そのリストに入っているゲームソフトのタイトルを、一つずつ標準出力してほしいな
		List<Gamesoft> gameSofts = new ArrayList<>();
		gameSofts.add(new Gamesoft("スプラトゥーン", "シューティング", "おもしろい！"));
		gameSofts.add(new Gamesoft("スプラトゥーン", "シューティング", "おもしろい！"));
		gameSofts.add(new Gamesoft("スプラトゥーン", "シューティング", "おもしろい！"));
		gameSofts.stream().map(Gamesoft::getTitle).forEach(System.out::println);
	}

	@Test
	public void want14_ニンテンドースイッチがほしいな() {
		// ほしいな詳細
	}

	@Test
	public void want15_ニンテンドースイッチにゲームソフトを保存できるようにしてほしいな() {
		// ほしいな詳細
		// installメソッドを作って、ゲームソフトを受け取ったらそれを保持できるようにしてほしいな
		// インストールしたゲームソフトはリストになっていてほしいな
		// インストールしたゲームソフトのタイトルを、一つずつ標準出力してほしいな
		NintendoSwitch nintendoSwitch = new NintendoSwitch();
		nintendoSwitch.install(new Gamesoft("スプラトゥーン", "シューティング", "おもしろい！"));
		nintendoSwitch.install(new Gamesoft("スプラトゥーン", "シューティング", "おもしろい！"));
		nintendoSwitch.install(new Gamesoft("スプラトゥーン", "シューティング", "おもしろい！"));
		nintendoSwitch.getGameSofts().stream().map(Gamesoft::getTitle).forEach(System.out::println);
	}

	// ===================================================================================
	// クラスを扱う 応用編
	// ================
	@Test
	public void ultimateWant_書いてあるものが全部ほしいな() {
		// ほしいな詳細
		// ・商品がほしいな
		// ・商品には名前と価格があってほしいな
		// ・名前と価格は商品を作った瞬間に持たせるようにしてほしいな
		// ・商品は自分が何個作られたのかわかるようになっていてほしいな
		// ・おかいものかごがほしいな
		// ・おかいものかごには商品リストをもたせることができるようにしてほしいな
		// ・おかいものかごには商品を一個ずつ入れることができて、一個ずつ入れた商品は商品リストに追加されるようにしてほしいな
		// ・レジがほしいな
		// ・レジはおかいものかごをもたせることができるようにしてほしいな
		// ・おかいものかごを渡せるようになっていてほしいな
		// ・レジに渡したおかいものかごの中には商品リストが入っているはずなので、それらの価格を足し合わせてレジで料金を算出できるようになっていてほしいな
		Product strawberry = new Product("いちご", 300);
		Product mikan = new Product("みかん", 600);
		Product milk = new Product("牛乳", 200);

		Bascket bascket = new Bascket();
		bascket.add(strawberry);
		bascket.add(mikan);
		bascket.add(milk);

		Register register = new Register();
		register.putBascket(bascket);

		int amount = register.calcAmount();
		System.out.println(amount);
	}

}
