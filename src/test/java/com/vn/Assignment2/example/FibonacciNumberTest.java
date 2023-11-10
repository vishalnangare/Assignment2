package com.vn.Assignment2.example;

import org.junit.jupiter.api.Test;
import com.vn.Assignment2.examples.FibonacciNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciNumberTest {

	@Test
	public void testNthFibonacci() {
		assertEquals(0, FibonacciNumber.nthFibonacci(0));
		assertEquals(1, FibonacciNumber.nthFibonacci(1));
		assertEquals(1, FibonacciNumber.nthFibonacci(2));
		assertEquals(21, FibonacciNumber.nthFibonacci(8));
		assertEquals(34, FibonacciNumber.nthFibonacci(9));
	}
}
