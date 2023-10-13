package aayushi_practice;

import java.math.BigDecimal;

/**
 * This program is used to programs to evaluate differences between == and
 * .equals in String, Integer, and BigDecimal.
 * 
 * @author Aayushi Agrawal
 * @since 31-08-2023
 */
public class DifferenceBetweenEquals {

	public static void main(String[] args) {
		Integer number1 = 5;
		Integer number2 = 6;

		String string1 = "Aayushi";
		String string2 = "Agrawal";

		BigDecimal decimal1 = new BigDecimal(40.00);
		BigDecimal decimal2 = new BigDecimal(54.00);

		// Comparision of Integer Class
		if (number1 == number2) {
			System.out.println("Equals");
		} else if (number1.equals(number2)) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}

		// Comparision of String Class
		if (string1 == string2) {
			System.out.println("Equals");
		} else if (string1.equals(string2)) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}

		// Comparision of Bigdecimal Class
		if (decimal1 == decimal2) {
			System.out.println("Equals");
		} else if (decimal1.equals(decimal2)) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}
	}

}
