package com.vn.Assignment2.examples;
public class SieveOfEratosthenes {

	public static void sieveOfEratosthenes(int no) {
		for (int i = 2; i <= no; i++) {

			boolean isPrime = true;
			for (int j = i - 1; j >= 2; j--) {

				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime)
				System.out.print(i + " ");

		}
	}

	public static void main(String[] args) {

		sieveOfEratosthenes(5);
	}

}
