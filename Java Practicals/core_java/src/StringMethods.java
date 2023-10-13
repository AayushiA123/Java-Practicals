package aayushi_practice;

/**
 * This program is use to show the uses of all the string methods like charAt(),
 * concat(), equals() etc.
 * 
 * @author Aayushi Agrawal
 * @since 31-08-2023
 */
public class StringMethods {

	public static void main(String[] args) {
		String stringOne = "Aayushi";
		String stringTwo = "Agrawal";
		// charAt() gives output of index.
		System.out.println(stringOne.charAt(4));
		// equals compare between two strings.
		System.out.println(stringOne.equals(stringTwo));
		// merges two string
		System.out.println(stringOne.concat(stringTwo));
	}

}
