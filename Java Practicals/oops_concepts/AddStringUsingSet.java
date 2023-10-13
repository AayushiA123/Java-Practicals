package oops_concepts;

import java.util.LinkedHashSet;
import java.util.Set;

public class AddStringUsingSet {

	public static void main(String[] args) {
	// Creating LinkedHashSet using the Set
		Set<String> data=new LinkedHashSet<String>();
		
		data.add("Hello");
		data.add("World");
		data.add("Aayushi");
		
		System.out.println(data);
	}

}
