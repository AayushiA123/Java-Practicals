package aayushi_practice;

/**
 * This program is used to demonstrate the use of break and Continue statement.
 *
 * @author Aayushi Agrawal
 * @since 31-08-2023
 */
public class BreakContinueStatement {

	public static void main(String[] args) {
		int variable;
		// Break statement
		for (variable = 0; variable < 10; variable++) {
			System.out.println(variable);
			break;
		}

		// Continue statement
		for (variable = 0; variable < 10; variable++) {
			if (variable == 4) {
				continue;
			}
			System.out.println(variable);
		}
	}

}
