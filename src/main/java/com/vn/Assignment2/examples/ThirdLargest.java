package com.vn.Assignment2.examples;

public class ThirdLargest {
	public static int thirdLargest(int[] a, int total) {
		if (total < 3) {
			return -1;
		}
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {

				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 3];
	}

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5, 6, 7 };
		int n = A.length;
		int result = thirdLargest(A, n);

		if (result != -1) {
			System.out.println("The third largest element is: " + result);
		} else {
			System.out.println("There are less than 3 elements in the array.");
		}
	}

}
