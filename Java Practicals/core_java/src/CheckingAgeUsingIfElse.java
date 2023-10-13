package aayushi_practice;

import java.util.Scanner;

/**
 * This program is used to demonstrate the use of if / else statements.
 *
 * @author Aayushi Agrawal
 * @since 28-08-2023
 */
public class CheckingAgeUsingIfElse {

	public static void main(String[] args) {
		// For taking input
		Scanner scanner = new Scanner(System.in);
		// Age is the number we take user input to implement if-else.
		System.out.println("Please Enter Your Age-");
		int age = scanner.nextInt();
		if (age < 18) {
			System.out.println("You Are Not Eligible");
		} else {
			System.out.println("You Are Eligible");
		}
	}

}
