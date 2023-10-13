package oops_concepts;

/**
 * This program demonstrate data abstraction.
 *
 * @author Aayushi Agrawal
 * @since 01-09-2023
 */
abstract class Human {
	
	// Abstract method (does not have a body)
	public abstract void HairColor();

	// Regular method
	public void EyesColor() {
		System.out.println("Blue");
	}

}

class Man extends Human {

	@Override
	public void HairColor() {
		System.out.println("Black");
	}

}
public class DataAbstraction {

	public static void main(String[] args) {
		Man man = new Man(); // Create a Man object
		man.EyesColor();
		man.HairColor();
	}

}
