package com.vn.Assignment2.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.vn.Assignment2.examples.SecondLargestFinder;

public class SecondLargestFinderTest { 

	@Test
	public void testPrint2Largest() {
		Integer[] arr = { 5, 2, 7, 8, 9, 4, 10 };
		int n = arr.length;

		Integer secondLargest = SecondLargestFinder.print2largest(arr, n);
		assertEquals(Integer.valueOf(9), secondLargest);
	}
}
