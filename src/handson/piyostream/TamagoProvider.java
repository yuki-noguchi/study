package handson.piyostream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TamagoProvider {

	private TamagoProvider() {
	}

	public static Tamago fetchRandomTamago() {
		if (new Random().nextInt() % 3 == 0) {
			return new Tamago(1);
		}
		if (new Random().nextInt() % 3 == 1) {
			return new Tamago(2, new Hiyoko("ぴよ子", Gender.FEMALE));
		}
		return new Tamago(3, new Hiyoko("ジョナサン・ジョースター", Gender.MALE, "ジョジョ"));
	}

	public static List<HiyokoTamago> fetchHiyokoTamagos() {
		List<HiyokoTamago> tamagos = new ArrayList<>();
		{
			Hiyoko hiyoko = new Hiyoko("ぴよタロウ", Gender.MALE);
			HiyokoTamago tamago = new HiyokoTamago(1, hiyoko);
			tamagos.add(tamago);
		}
		{
			Hiyoko hiyoko = new Hiyoko("ぴよ子", Gender.FEMALE);
			HiyokoTamago tamago = new HiyokoTamago(2, hiyoko);
			tamagos.add(tamago);
		}
		{
			Hiyoko hiyoko = new Hiyoko("空条承太郎", Gender.MALE, "ジョジョ");
			HiyokoTamago tamago = new HiyokoTamago(3, hiyoko);
			tamagos.add(tamago);
		}
		{
			Hiyoko hiyoko = new Hiyoko("ぴよっち", Gender.FEMALE);
			HiyokoTamago tamago = new HiyokoTamago(4, hiyoko);
			tamagos.add(tamago);
		}
		{
			Hiyoko hiyoko = new Hiyoko("ぴよっち", Gender.FEMALE);
			HiyokoTamago tamago = new HiyokoTamago(5, hiyoko);
			tamagos.add(tamago);
		}
		{
			Hiyoko hiyoko = new Hiyoko("サイタマ", Gender.MALE, "ハゲマント");
			HiyokoTamago tamago = new HiyokoTamago(6, hiyoko);
			tamagos.add(tamago);
		}
		return tamagos;
	}

	public static List<Tamago> fetchTamagos() {
		List<Tamago> tamagos = new ArrayList<>();
		{
			Tamago tamago = new Tamago(1);
			tamagos.add(tamago);
		}
		{
			Hiyoko hiyoko = new Hiyoko("ぴよタロウ", Gender.MALE);
			Tamago tamago = new Tamago(2, hiyoko);
			tamagos.add(tamago);
		}
		{
			Hiyoko hiyoko = new Hiyoko("ぴよ子", Gender.FEMALE);
			Tamago tamago = new Tamago(3, hiyoko);
			tamagos.add(tamago);
		}
		{
			Tamago tamago = new Tamago(4);
			tamagos.add(tamago);
		}
		{
			Hiyoko hiyoko = new Hiyoko("ぴよの助", Gender.MALE);
			Tamago tamago = new Tamago(5, hiyoko);
			tamagos.add(tamago);
		}
		{
			Hiyoko hiyoko = new Hiyoko("ぴよっち", Gender.FEMALE);
			Tamago tamago = new Tamago(6, hiyoko);
			tamagos.add(tamago);
		}
		{
			Tamago tamago = new Tamago(7);
			tamagos.add(tamago);
		}
		{
			Tamago tamago = new Tamago(8);
			tamagos.add(tamago);
		}
		{
			Hiyoko hiyoko = new Hiyoko("ぴよざべす", Gender.FEMALE);
			Tamago tamago = new Tamago(9, hiyoko);
			tamagos.add(tamago);
		}
		{
			Tamago tamago = new Tamago(10);
			tamagos.add(tamago);
		}
		return tamagos;
	}
}
