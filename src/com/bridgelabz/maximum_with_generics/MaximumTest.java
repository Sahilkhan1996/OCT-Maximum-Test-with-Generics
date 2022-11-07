package com.bridgelabz.maximum_with_generics;

public class MaximumTest {
	public static void main(String[] args) {
		// Checking maximum with integers
		computeMax(100, 20, 30);
		computeMax(10, 100, 30);
		computeMax(40, 20, 100);
		// Checking with the 3 float values
		computeMax(100.0F, 20.0F, 30.0F);
		computeMax(10.0F, 500.1F, 30.2F);
		computeMax(40.4F, 20.7F, 300.9F);
	}

	private static <T extends Comparable<T>> void computeMax(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		System.out.println("Maximum Number is:" + max);
	}

}