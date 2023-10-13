package oops_concepts;

/**
 * This program is use to demonstrate the example of constructor and
 * Parameterized constructor. *
 * 
 * @author Aayushi Agrawal
 * @since 01-09-2023
 */
class Addition {

	int add(int a, int b) {
		System.out.print("Addition of Two Number- ");
		return a + b;
	}

	int add(int a, int b, int c) {
		System.out.print("Addition of Three Number- ");
		return a + b + c;
	}

}

public class ImplementationOfCompiletimePolymorphism {

	public static void main(String[] args) {
		Addition addition = new Addition();
		System.out.println(addition.add(3, 4));
		System.out.println(addition.add(3, 4, 5));
	}

}