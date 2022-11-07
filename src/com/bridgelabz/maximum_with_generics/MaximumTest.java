package com.bridgelabz.maximum_with_generics;

public class MaximumTest {
	public static void main(String[] args) {
		//Checking maximum with integers
		computeMax(100, 20, 30);
		computeMax(10, 100, 30);
		computeMax(40, 20, 100);
	}

	private static void computeMax(Integer x, Integer y, Integer z) {
		int max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		System.out.println("Maximum Number is:" + max);
	}

}