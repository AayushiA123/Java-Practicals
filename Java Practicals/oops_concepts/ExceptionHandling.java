package oops_concepts;

public class ExceptionHandling extends Exception {

	public static void main(String[] args) {

		int sum = 10;
		try {
			sum = sum / 0;
		} catch (ArithmeticException e) {
			throw e;
		}finally {
			System.out.println("This is the finally Block");
		}
	}
}
