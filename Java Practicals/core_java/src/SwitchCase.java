package aayushi_practice;

import java.util.Scanner;

/**
 * This program finds the current month name from the given number of the switch
 * case.
 *
 * @author Aayushi Agrawal
 * @since 28-08-2023
 */
public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("Please Enter Number- ");
		// for taking input
		Scanner scanner = new Scanner(System.in);
		// number is a variable we take from user to apply switch case accordingly.
		int number;
		number = scanner.nextInt();
		switch (number) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Invalid month.");
			break;
		}
	}

}
