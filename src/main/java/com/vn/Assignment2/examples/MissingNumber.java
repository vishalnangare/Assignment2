package com.vn.Assignment2.examples;

public class MissingNumber {
	public static int missingNumber(int[] arr, int N) {

		int sumNaturalNumbers = (N * (N + 1)) / 2;

		int sumArray = 0;
		for (int num : arr) {
			sumArray += num;
		}

		return sumNaturalNumbers - sumArray;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5 };
		int N = 5;

		int missing = missingNumber(arr, N);
		System.out.println("The missing number is: " + missing);
	}
}
