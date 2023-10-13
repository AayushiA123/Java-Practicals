package oops_concepts;

import java.util.Arrays;
import java.util.Comparator;

class Employee {
	String firstName;
	String lastName;

	// Constructor sets firstName and lastName
	public Employee(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}

	// User-friendly output when printed.
	public String toString() {
		return "( " + lastName + ", " + firstName + " )";
	}
}

class EmployeeSort implements Comparator<Employee> {

	// Implement the Comparator interface
	@Override
	public int compare(Employee valueA, Employee valueB) {
		if (valueA.lastName.compareTo(valueB.lastName) != 0) {
			// If lastNames are different, compare lastName
			return valueA.lastName.compareTo(valueB.lastName);
		} else {
			// If lastNames are the same, compare firstName
			return valueA.firstName.compareTo(valueB.firstName);
		}
	}
}

public class ImplementsComparatorInterface {

	public static void main(String[] args) {
		// Set up array with a few Employee classes
		Employee a[] = new Employee[5];
		a[0] = new Employee("Kirk", "Douglas");
		a[1] = new Employee("Mel", "Brooks");
		a[2] = new Employee("Jane", "Fonda");
		a[3] = new Employee("Henry", "Fonda");
		a[4] = new Employee("Michael", "Douglas");

		// Use .sort() method with Comparable class.
		Arrays.sort(a, new EmployeeSort());

		// Print out the sorted Employees
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}	
}