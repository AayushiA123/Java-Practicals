package aayushi_practice;

/**
 * This program is used to demonstrate the use of all types of loops in java
 * such as for loop, while loop, do-while loop. *
 * 
 * @author Aayushi Agrawal
 * @since 29-08-2023
 */
public class UseOfLoops {

	public static void main(String[] args) {

		// While loop
		int number = 1;
		while (number <= 10) {
			System.out.println(number);
			number++;
		}

		// For loop
		for (number = 1; number <= 10; number++) {
			System.out.println(number);
		}

		// Do while loop
		do {
			System.out.println(number);
			number++;
		} while (number <= 10);
	}

}
