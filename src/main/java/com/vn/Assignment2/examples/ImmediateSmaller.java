package com.vn.Assignment2.examples;

public class ImmediateSmaller {
	public static void ImmediateSmaller(int[] arr, int n) {
		for (int i = 0; i < n - 1; i++) {
			if (arr[i + 1] < arr[i]) {
				arr[i] = arr[i + 1];
			} else { 
				arr[i] = -1;
			}
		}

		arr[n - 1] = -1;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 2, 1, 5, 3 };
		int n = arr.length;

		ImmediateSmaller(arr, n);

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
