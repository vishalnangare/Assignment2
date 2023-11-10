package com.vn.Assignment2.examples;

public class FibonacciNumber {

	public static int nthFibonacci(int n) {
		if (n <= 1) {
			return n;
		}

		int a = 0;
		int b = 1;

		for (int i = 2; i <= n; i++) {
			int temp = (a + b) % 1000000007;
			a = b;
			b = temp;
		}

		return b;
	}

	public static void main(String[] args) {
		int n = 9;
		int result = nthFibonacci(n);
		System.out.println("Input N=" + n + " OUTPUT " + result + "" + " Explanation: " + n + " is the " + result
				+ " number of fibonacci series.");
	}
}
