package study.animal;

public class Main {

	public static void main(String[] args) {
//		new Animal();
		Dog dog = new Dog();
		System.out.println(dog.getCry());

		Cat cat = new Cat();
		System.out.println(cat.getCry());

		Animal bird = new Animal() {
			@Override
			public String getCry() {
				return "ぴよ";
			}
		};

		Chiwawa chiwawa = new Chiwawa();
		System.out.println(chiwawa.getCry());
		chiwawa.目をうるうるさせる();
	}
}
