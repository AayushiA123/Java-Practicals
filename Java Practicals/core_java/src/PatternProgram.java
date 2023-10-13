package aayushi_practice;

/**
 * This program is used to make the program in the given pattern.
 *
 * @author Aayushi Agrawal
 * @since 28-08-2023
 */
public class PatternProgram {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}