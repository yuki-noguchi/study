package handson.piyostream;

import java.util.List;

import org.junit.Test;

@SuppressWarnings("unused")
public class PiyoStreamTest {

	// ===================================================================================
	// 単品のタマゴ（ヒヨコは入っているかは分からない）
	// ========
	@Test
	public void タマゴの番号を表示する() {
		Tamago tamago = TamagoProvider.fetchRandomTamago();

		// Question 以下の情報を標準出力で出して欲しい
		// - タマゴの番号
	}

	@Test
	public void ヒヨコの名前を表示する() {
		Tamago tamago = TamagoProvider.fetchRandomTamago();

		// Question 以下の情報を標準出力で出して欲しい
		// - ヒヨコの名前。ただしヒヨコが入っていないタマゴだったらば、代わりにハイフンを表示してほしい。
	}

	@Test
	public void ヒヨコのニックネームを表示する() {
		Tamago tamago = TamagoProvider.fetchRandomTamago();

		// Question 以下の情報を標準出力で出して欲しい
		// - ヒヨコのニックネーム。
		// ただしヒヨコが入っていないタマゴだったり、ニックネームが無いヒヨコの場合には、代わりにハイフンを表示してほしい。
	}

	@Test
	public void ヒヨコからヒヨコ饅頭を作る() {
		Tamago tamago = TamagoProvider.fetchRandomTamago();

		// Question ヒヨコ(Hiyoko)からヒヨコ饅頭(HiyokoManju)を作って欲しい。
		// 結果はOptional型でも良い。
	}

	@Test
	public void ヒヨコからヒヨコ饅頭の作って味を確認する() {
		Tamago tamago = TamagoProvider.fetchRandomTamago();

		// Question ヒヨコからヒヨコ饅頭を作って、その饅頭の味を取得して欲しい。
		// もしヒヨコが入っていないタマゴの場合には「分からない」という味にしてほしい。
		// 最終的に、味のString変数が欲しい。
	}

	// ===================================================================================
	// リスト(タマゴにヒヨコは必ず入っている)
	// ========
	@Test
	public void タマゴの番号とヒヨコの名前を表示する() {
		List<HiyokoTamago> hiyokoTamagos = TamagoProvider.fetchHiyokoTamagos();

		// Question 以下の情報を標準出力で出して欲しい
		// - タマゴの番号
		// - ヒヨコの名前
		// - ヒヨコのニックネーム。
		// ただしニックネームが無いヒヨコの場合には、代わりにハイフンを表示してほしい。
	}

	@Test
	public void 番号が偶数のタマゴだけのリストを作る() {
		List<HiyokoTamago> hiyokoTamagos = TamagoProvider.fetchHiyokoTamagos();

		// Question 番号が偶数だけタマゴだけのリストを作って欲しい
		// 確認のため、標準出力で番号を出して欲しい
	}

	@Test
	public void ヒヨコのリストを作る() {
		List<HiyokoTamago> hiyokoTamagos = TamagoProvider.fetchHiyokoTamagos();

		// Question ヒヨコのリストを作って欲しい。タマゴのリストではないので注意。
		// 確認のため、以下の情報を標準出力で出して欲しい
		// - ヒヨコの名前
		// - ヒヨコの性別
	}

	@Test
	public void メスのヒヨコだけのリストを作る() {
		List<HiyokoTamago> hiyokoTamagos = TamagoProvider.fetchHiyokoTamagos();

		// Question メスのヒヨコのリストを作って欲しい。タマゴのリストではないので注意。
		// 確認のため、以下の情報を標準出力で出して欲しい
		// - ヒヨコの名前
		// - ヒヨコの性別
	}

	@Test
	public void ヒヨコの名前のリストを作る() {
		List<HiyokoTamago> hiyokoTamagos = TamagoProvider.fetchHiyokoTamagos();

		// Question ヒヨコの名前のリストを作って欲しい。タマゴやヒヨコのリストではないので注意。
		// 確認のため、以下の情報を標準出力で出して欲しい
		// - ヒヨコの名前
	}

	@Test
	public void ヒヨコ饅頭のリストを作る() {
		List<HiyokoTamago> hiyokoTamagos = TamagoProvider.fetchHiyokoTamagos();

		// Question ヒヨコ饅頭のリストを作って欲しい。タマゴやヒヨコのリストではないので注意。
		// 確認のため、以下の情報を標準出力で出して欲しい
		// - ヒヨコ饅頭の名前
		// - ヒヨコ饅頭の味
	}

	@Test
	public void ヒヨコの名前のリストを作る_ただし同じ名前のものは含まない() {
		List<HiyokoTamago> hiyokoTamagos = TamagoProvider.fetchHiyokoTamagos();

		// Question ヒヨコの名前のリストを作って欲しい。タマゴやヒヨコのリストではないので注意。
		// 確認のため、以下の情報を標準出力で出して欲しい
		// - ヒヨコの名前
	}

	@Test
	public void タマゴの番号が偶数の_メスのヒヨコだけのリストを作る() {
		List<HiyokoTamago> hiyokoTamagos = TamagoProvider.fetchHiyokoTamagos();

		// Question タマゴの番号が偶数、かつ、メスのヒヨコのリストを作って欲しい。タマゴのリストではないので注意。
		// 確認のため、以下の情報を標準出力で出して欲しい
		// - ヒヨコの名前
		// - ヒヨコの性別
	}

	@Test
	public void メスのヒヨコだけでヒヨコ饅頭が作りたい() {
		List<HiyokoTamago> hiyokoTamagos = TamagoProvider.fetchHiyokoTamagos();

		// Question タマゴの番号が偶数、かつ、メスのヒヨコの饅頭のリストを作って欲しい。タマゴやヒヨコのリストではないので注意。
		// 確認のため、以下の情報を標準出力で出して欲しい
		// - ヒヨコ饅頭の名前
		// - ヒヨコ饅頭の味
	}

	@Test
	public void 全てのタマゴの番号の合計値が知りたい() {
		List<HiyokoTamago> hiyokoTamagos = TamagoProvider.fetchHiyokoTamagos();

		// Question 全てのタマゴの番号の合計値を、標準出力で出して欲しい
	}

	@Test
	public void メスのヒヨコだけタマゴの番号の合計値が知りたい() {
		List<HiyokoTamago> hiyokoTamagos = TamagoProvider.fetchHiyokoTamagos();

		// Question メスのヒヨコのタマゴの番号の合計値を、標準出力で出して欲しい
	}

	@Test
	public void オスのヒヨコのリストと_メスとヒヨコのリストを作りたい() {
		List<HiyokoTamago> hiyokoTamagos = TamagoProvider.fetchHiyokoTamagos();

		// Question オスのヒヨコのリストと、メスのヒヨコのリスト。その２つのリストを作って欲しい。
		// 確認のため、それぞれのリストで、以下の情報を標準出力で出して欲しい
		// - ヒヨコの名前
		// - ヒヨコの性別
	}

	@Test
	public void オスのヒヨコのリストと_メスとヒヨコのリストを作りたい_ただしstreamを使ってよいのは１回までとする() {
		List<HiyokoTamago> hiyokoTamagos = TamagoProvider.fetchHiyokoTamagos();

		// Question オスのヒヨコのリストと、メスのヒヨコのリスト。その２つのリストを作って欲しい。
		// ただし、stream()関数を使って良いのは１回のみとする。
		// 確認のため、それぞれのリストで、以下の情報を標準出力で出して欲しい
		// - ヒヨコの名前
		// - ヒヨコの性別
	}

	// ===================================================================================
	// リスト(タマゴにヒヨコは必ず入っているとは限らない)
	// ========
	@Test
	public void ヒヨコが入っているタマゴだけのリストを作る() {
		List<Tamago> tamagos = TamagoProvider.fetchTamagos();

		// Question ヒヨコが入っているタマゴだけのリストを作って欲しい
		// 確認のため、以下の情報を標準出力で出して欲しい
		// - タマゴの番号
		// - ヒヨコの名前
	}

	@Test
	public void ヒヨコだけのリストを作る() {
		List<Tamago> tamagos = TamagoProvider.fetchTamagos();

		// Question ヒヨコのリストを作って欲しい。タマゴのリストではないので注意。
		// 確認のため、以下の情報を標準出力で出して欲しい
		// - ヒヨコの名前
		// - ヒヨコの性別
	}
}