package com.vn.Assignment2.examples;

import java.util.Arrays;

public class KthSmallestElement {

	public static int findSmallest(int no, int arr[]) {

		Arrays.sort(arr);

		return arr[0 + no - 1];

	}

	public static void main(String[] args) {

		int arr[] = { 17, 24, 6, 2, 3, 5 };
		int no = 4;
		System.out.println("Input " + no + " Smallest No " + findSmallest(no, arr));
	}
}
