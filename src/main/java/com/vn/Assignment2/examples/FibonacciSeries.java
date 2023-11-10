package com.vn.Assignment2.examples;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {

	public static List<Integer> series(int n) {
		int n1 = 0, n2 = 1, n3, i, count = 10;
		List<Integer> s1 = new ArrayList<Integer>();
		for (i = 2; i < count; ++i) {
			n3 = n1 + n2;
			s1.add(n3);
			n1 = n2;
			n2 = n3;
		}
		return s1; 
	}

	public static void main(String[] args) {
		int input = 4;
		List<Integer> output = series(input);
		System.out.print("Input " + input + " Output:");
		output.forEach(item -> {
			System.out.print(" " + item);
		});

	}
}
