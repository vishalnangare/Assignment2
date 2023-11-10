package com.vn.Assignment2.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.vn.Assignment2.examples.ThirdLargest;

public class ThirdLargestTest {

	@Test
	public void testThirdLargest() {
		int[] A = { 1, 2, 3, 4, 5, 6, 7 };
		int n = A.length;
		int result = ThirdLargest.thirdLargest(A, n);
		assertEquals(5, result); 
	}

	@Test
	public void testThirdLargestWithLessThanThreeElements() {
		int[] A = { 1, 2 };
		int n = A.length;
		int result = ThirdLargest.thirdLargest(A, n);
		assertEquals(-1, result); 
	}
}
