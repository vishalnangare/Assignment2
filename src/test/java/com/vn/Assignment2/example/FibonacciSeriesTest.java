package com.vn.Assignment2.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.vn.Assignment2.examples.FibonacciSeries;

public class FibonacciSeriesTest {
	@Test
	public void testSeries() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(10);
		expected.add(4);
		expected.add(6);
		expected.add(7);
		List<Integer> actual = FibonacciSeries.series(10);

		assertEquals(expected, actual);
	}
}
