package java8.optional;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		OptionalStudy study = new OptionalStudy();
		String string = study.getNullableString();

		System.out.println("----------------ifの中でnullチェック----------------");
		// Otpionalがなかった時のNullチェック
		// Nullチェックしないとヌルポしちゃうかもしれない
		if (string != null) {
			String replacedString = string.replace("文字列", "置き換え");
			System.out.println(replacedString);
		}

		Optional<String> optString = study.getOptString();

		System.out.println("----------------isPresent----------------");
		// Optionalの中に値が存在するかどうかをチェック
		if (optString.isPresent()) {
			String replacedString = optString.get().replace("文字列", "置き換え");
			System.out.println(replacedString);
		}

		System.out.println("----------------ifPresent----------------");
		// もし中身があったら、strという変数に中身を詰めて、中括弧の中の処理を行う
		// 返り値はなし。
		optString.ifPresent(str -> {
			String replacedString = str.replace("文字列", "置き換え");
			System.out.println(replacedString);
		});

		System.out.println("----------------map----------------");
		// もし中身があったら、strという変数に中身を詰めて、中括弧の中の処理を行う
		// 値を返すことができるので、別のなにかに変換したいときに使う
		Optional<Integer> optStrLength = optString.map(str -> {
			return str.length();
		});
		optStrLength.ifPresent(length -> {
			System.out.println(length);
		});

		System.out.println("----------------orElse----------------");
		// 中身がなかった場合のデフォルトの値を指定する
		String orElse = optString.orElse("なにもなかった");
		System.out.println(orElse);
	}
}
