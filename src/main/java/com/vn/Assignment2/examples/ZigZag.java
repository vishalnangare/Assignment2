package com.vn.Assignment2.examples;

public class ZigZag {

	public static void zigZag(int[] arr, int n) {
		boolean flag = true;

		for (int i = 0; i < n - 1; i++) {
			if (flag) {

				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			} else {

				if (arr[i] < arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}

			flag = !flag;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 7, 8, 6, 2, 1 };
		int n = arr.length;

		zigZag(arr, n);

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
