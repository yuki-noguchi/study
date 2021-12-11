package study.basic.objectoriented.inheritance.animal;

public class Dog extends Animal {

	// dog is a animal -> o
	// animal is a dog -> x

	@Override
	public String getCry() {
		return "わんわん";
	}
}
