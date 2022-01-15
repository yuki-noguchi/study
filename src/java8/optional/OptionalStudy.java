package java8.optional;

import java.util.Optional;
import java.util.Random;

public class OptionalStudy {

	public String getNullableString() {
		int random = randomInt();
		if (random % 2 == 0) {
			return "文字列だよ〜";
		} else {
			return null;
		}
	}

	public Optional<String> getOptString() {
		int random = randomInt();
		if (random % 2 == 0) {
			return Optional.of("文字列だよ〜");
		} else {
			return Optional.empty();
		}
	}

	private int randomInt() {
		return new Random().nextInt(10);
	}
}
