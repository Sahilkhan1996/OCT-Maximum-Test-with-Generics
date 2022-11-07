package com.bridgelabz.maximum_with_generics;

public class MaximumTest {
	
	public static void main(String[] args) {
		// Checking maximum with integers
		testMaximum(100, 20, 30,40,50,50,101);
		testMaximum(10, 100, 30);
		testMaximum(40, 20, 100);
		// Checking with the 3 float values
		testMaximum(100.0F, 20.0F, 30.0F);
		testMaximum(10.0F, 500.1F, 30.2F);
		testMaximum(40.4F, 20.7F, 300.9F);
		testMaximum("Apple","Peach","Banana");
		testMaximum("Peach","Apple","Banana");
		testMaximum("Peach","Banana", "Apple");
	}


	@SafeVarargs
	private static <T extends Comparable<T>> void testMaximum(T...input) {
		T max = input[0];
		for(int i=0; i<input.length; i++) {
			if(input[i].compareTo(max)>0) {
				max=input[i];
			}
		}	
		System.out.println("Maximum Number is:" + max);
	}

}