package com.vn.Assignment2.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

import com.vn.Assignment2.examples.ZigZag;

public class ZigZagTest {

	@Test
	public void testZigZag() {
		int[] arr = { 4, 3, 7, 8, 6, 2, 1 };
		int n = arr.length;

		ZigZag.zigZag(arr, n);

		int[] expected = { 3, 7, 4, 8, 2, 6, 1 };
		assertArrayEquals(expected, arr);
	}
}
