package com.vn.Assignment2.examples;

import java.util.HashSet;
import java.util.Set;

public class Countsubsets {
	public static int countSubsets(int[] a, int n) {

		Set<Integer> evenSet = new HashSet<>();

		for (int num : a) {
			if (num % 2 == 0) {
				evenSet.add(num);
			}
		}

		int distinctEvenCount = evenSet.size();

		int count = (int) Math.pow(2, distinctEvenCount) - 1;

		return count;
	}

	public static void main(String[] args) {
		int[] a = { 2, 4, 8 };
		int n = a.length;
		int result = countSubsets(a, n);
		System.out.println("Count of subsets with distinct even numbers: " + result);
	}
}
