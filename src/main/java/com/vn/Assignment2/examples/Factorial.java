package com.vn.Assignment2.examples;

public class Factorial {

	public static String factorial(int N) {
		if (N == 0 || N == 1) {
			return "1";
		} else {
			StringBuilder explanation = new StringBuilder();
			explanation.append(N);
			for (int i = N - 1; i >= 1; i--) {
				explanation.append("*").append(i);
			}
			return explanation.toString();
		}
	}

	public static int getfactorial(int N) {
		int fact = 1;
		if (N == 0 || N == 1) {
			return 1;
		} else {

			for (int i = 1; i <= N; i++) {

				fact = fact * i;
			}
			return fact;

		}

	}

	public static void main(String[] args) {
		int N = 5;
		String result = factorial(N);
		System.out.println("Input: N = " + N + " Output: " + getfactorial(N) + " Explanation: " + result);
	}
}
