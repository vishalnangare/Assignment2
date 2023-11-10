package com.vn.Assignment2.example;

import java.util.Arrays;
public class SecondSmallest {
	public static int secondSmallest(int[] input, int length) {

		int smallest = input[0];

		int secondSmallest = input[0];

		for (int i = 0; i < input.length; i++) {
			if (input[i] < smallest) {
				secondSmallest = smallest;

				smallest = input[i];
			} else if (input[i] > smallest && input[i] < secondSmallest) {
				secondSmallest = input[i];
			}
		}

		System.out.println("Input Array : " + Arrays.toString(input));

		System.out.println("Smallest Element : " + smallest);

		System.out.println("Second Smallest Element : " + secondSmallest);
		return secondSmallest;

	}

	public static void main(String[] args) {
		int[] A = { 15, 4, 9, 3, 6 };
		int N = A.length;
		secondSmallest(A, N);
	}

	
}
