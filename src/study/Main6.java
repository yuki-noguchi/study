package study;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main6 {

	public static void main(String[] args) {
		Map<String, String> animalMap = new HashMap<>();
		animalMap.put("cat", "四足歩行の哺乳類。鳴き声はにゃ～んと言う。かわいい。");
		animalMap.put("dog", "四足歩行の哺乳類。鳴き声はわんわんと言う。かわいい。");
		animalMap.put("bird", "羽が生えていて空を飛べる。鳴き声は色々。そこそこかわいい。");

		Map<String, List<String>> map2 = new HashMap<>();
		List<String> list = List.of("1", "2", "3");

		map2.put("key1", list); // キー: "key1" バリュー: list

		List<String> list2 = map2.get("key1"); // list と list2は一緒のものが入っている

//		System.out.println(list2);

		map2.forEach((key, value) -> {
			value.forEach(val -> {
				System.out.println(val);
			});
		});

//		1
//		2
//		3

//		System.out.println(animalMap.get("dog"));

//		animalMap.forEach((key, value) -> {
//			System.out.println("キー" + key);
//			System.out.println("バリュー" + value);
//		});
	}
}
