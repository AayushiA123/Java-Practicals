package oops_concepts;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(5);
		numbers.add(6);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		System.out.println("Array List with SD");
		System.out.println(numbers);
		LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);
		ArrayList<Integer> uniqueList = new ArrayList<>(uniqueNumbers);
		System.out.println("Array List without duplicates");
		System.out.println(uniqueList);
	}

}
