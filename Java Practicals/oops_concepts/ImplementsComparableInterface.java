package oops_concepts;

import java.io.*;
import java.util.*;

class Pair implements Comparable<Pair> {
	int y;

	public Pair(int y)
	{
		this.y = y;
	}

	public String toString()
	{
		return "(" + y + ")";
	}

	@Override public int compareTo(Pair a)
	{
		// if the string are not equal
//		if (this.x.compareTo(a.x) != 0) {
//			return this.x.compareTo(a.x);
//		}
//		else {
			// we compare int values
			// if the strings are equal
			return this.y - a.y;
		
	}
}

public class ImplementsComparableInterface {
	public static void main(String[] args)
	{

		int n = 4;
		Pair arr[] = new Pair[n];

		arr[0] = new Pair(3);
		arr[1] = new Pair(4);
		arr[2] = new Pair(5);
		arr[3] = new Pair(2);

		// Sorting the array
		Arrays.sort(arr);

		// printing the
		// Pair array
		print(arr);
	}

	public static void print(Pair[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
