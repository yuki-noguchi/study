package java8.stream;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		StreamStudy study = new StreamStudy();

		List<String> fruits = study.getFruits();

		ArrayList<String> newList = new ArrayList<>();
		for (int i = 0; i < fruits.size(); i++) {
			newList.add(fruits.get(i));
		}
		for (int i = 0; i < fruits.size(); i++) {
			newList.add(fruits.get(i));
		}

//		fruits.forEach(fruit -> {
//			System.out.println(fruit);
//		});

//		ArrayList<String> newList = new ArrayList<>();
//		fruits.forEach(fruit -> {
//			String newFruit = "果物: " + fruit;
//			newList.add(newFruit);
//		});
//		newList.forEach(f -> {
//			System.out.println(f);
//		});

//		List<String> newList = fruits.stream().map(fruit -> {
//			return "果物: " + fruit;
//		}).collect(Collectors.toList());

		fruits.stream().map(fruit -> {
			return "果物: " + fruit;
		}).map(fruit -> {
			return "ジャンル: " + fruit;
		}).forEach(fruit -> {
			System.out.println(fruit);
		});

		fruits.stream().filter(fruit -> {
			boolean contains = fruit.contains("り"); // true/false
			return !contains;
		}).forEach(fruit -> {
			System.out.println(fruit);
		});
	}
}
