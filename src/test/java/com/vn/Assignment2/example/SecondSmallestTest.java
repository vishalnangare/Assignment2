package com.vn.Assignment2.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SecondSmallestTest {

	@Test 
	public void testFindSecondSmallest() {
		int[] input = { 15, 4, 9, 3, 6 };
		int expectedSecondSmallest = 4;

		int result = SecondSmallest.secondSmallest(input, input.length);

		assertEquals(expectedSecondSmallest, result);
	}

}
