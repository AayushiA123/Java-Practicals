package aayushi_practice;

/**
 * This program demonstrate the use of static methods, variables, and blocks.
 *
 * @author Aayushi Agrawal
 * @since 31-08-2023
 */
public class UseOfStaticKeyword {

	public static int variable = 4;

	// Use of static block
	static {
		System.out.println("This is static block");
	}

	// Use of static method
	static void demo() {
		System.out.println("This is demo class method");
	}

	public static void main(String[] args) {
		System.out.println(variable);
		demo();
	}

}