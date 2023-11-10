package com.vn.Assignment2.examples;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestFinder {
	public static int print2largest(Integer[] arr, int n) {

		Arrays.sort(arr, Collections.reverseOrder());

		return arr[1];
	}

	public static void main(String[] args) {
		Integer[] arr = { 5, 2, 7, 8, 9, 4, 10 };
		int n = arr.length;

		Integer secondLargest = print2largest(arr, n);

		System.out.println("The second largest distinct element is: " + secondLargest);

	}
}
