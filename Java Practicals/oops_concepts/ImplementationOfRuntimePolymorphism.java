package oops_concepts;
/**
 * This program is use to demonstrate the example of constructor and
 * Parameterized constructor. *
 * 
 * @author Aayushi Agrawal
 * @since 31-08-2023
 */
//-------------Example of Java Runtime Polymorphism-----------------
class Animal {

	void color() {
		System.out.println("Black");
	}

}

class Dog extends Animal {

	void color() {
		System.out.println("Blue");

	}
}

public class ImplementationOfRuntimePolymorphism {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.color();
	}
}