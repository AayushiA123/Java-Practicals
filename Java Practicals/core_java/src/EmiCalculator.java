package aayushi_practice;

/**
 * This program is used to make the program to calculate EMI using Class,
 * Object, Variables, Operators, and Datatypes.
 *
 * @author Aayushi Agrawal
 * @since 31-08-2023
 */
public class EmiCalculator {

	// P x R x (1+R)^N / [(1+R)^N-1]
	//
	// p: Principal loan amount = INR 10,000,00
	// n: Loan tenure in months = 120 months
	// r: Interest rate per month [7.2/12/100] = 0.006
	// e: Equated Monthly Installment(EMI)

	int principal = 1000000;
	int time = 120;
	double rate = 0.006;
	// Formula for calculating emi
	double emiOutput = (principal * rate * Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time) - 1);

	public static void main(String[] args) {
		EmiCalculator emi = new EmiCalculator();
		System.out.println(emi.emiOutput);
	}

}
