package com.vn.Assignment2.examples;

public class MaxProductSubarrayFinder {
	public static int maxProduct(int[] arr, int n) {
		if (n == 0) {
			return 0;
		}

		int maxEndingHere = arr[0];
		int minEndingHere = arr[0];
		int maxProductSoFar = arr[0];

		for (int i = 1; i < n; i++) {
			int temp = maxEndingHere;
			maxEndingHere = Math.max(arr[i], Math.max(arr[i] * maxEndingHere, arr[i] * minEndingHere));
			minEndingHere = Math.min(arr[i], Math.min(arr[i] * temp, arr[i] * minEndingHere));
			maxProductSoFar = Math.max(maxProductSoFar, maxEndingHere);
		}

		return maxProductSoFar;
	}

	public static void main(String[] args) {
		int[] arr = { 6, -3, -10, 0, 2};
		int n = arr.length;

		int maxProduct = maxProduct(arr, n);
		System.out.println("Maximum Product of Subarray: " + maxProduct);
	}
}
