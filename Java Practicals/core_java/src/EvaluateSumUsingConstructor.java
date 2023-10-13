package aayushi_practice;

/**
 * This program is use to demonstrate the example of constructor and
 * Parameterized constructor. *
 * 
 * @author Aayushi Agrawal
 * @since 31-08-2023
 */
public class EvaluateSumUsingConstructor {

	// Default constructor
	EvaluateSumUsingConstructor() {
		System.out.println("This is Defualt Constructor");
	}

	// Parameterized constructor
	EvaluateSumUsingConstructor(int number1, int number2) {
		System.out.println("This is Parameterized Constructor.");
		int sum = number1 + number2;
		System.out.print("Output After Adding Inout from Parameterized Constructor-");
		System.out.println(sum);
	}

	public static void main(String[] args) {
		EvaluateSumUsingConstructor defaultConstructor = new EvaluateSumUsingConstructor();
		EvaluateSumUsingConstructor parameterizedConstructor = new EvaluateSumUsingConstructor(3, 4);
	}

}
