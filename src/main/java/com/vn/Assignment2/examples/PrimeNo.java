package com.vn.Assignment2.examples;

public class PrimeNo {
	public static int isPrime(int N) {
		if (N <= 1) {
			return 0; 
		}
 
		if (N <= 3) {
			return 1;
		}

		if (N % 2 == 0 || N % 3 == 0) {
			return 0;
		}

		return 1;
	}

	public static void factors(int number) {
		int count = 0; 
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		System.out.print("Explanation " + number + " has " + count + " factors ");
		count=0;
		for (int i = 1; i <= number; i++) {
			
			if (number % i == 0) {
				count++;
				System.out.print(i + " ");
				
			}
		}
	}

	public static void main(String[] args) {

		int N = 5;
		System.out.println("input N= " + N + " OutPut: " + isPrime(N));
		factors(N);
	}
}
