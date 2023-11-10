package com.vn.Assignment2.example;

import org.junit.jupiter.api.Test;

import com.vn.Assignment2.examples.MergeStrings;

import org.junit.jupiter.api.Assertions;

public class MergeStringsTest {

	@Test
	public void testMerge() {
		String S1 = "abc";
		String S2 = "12345";

		String mergedString = MergeStrings.merge(S1, S2);

		Assertions.assertEquals("a1b2c345", mergedString);
	}

	@Test
	public void testMergeEmptyStrings() {
		String S1 = "";
		String S2 = "";

		String mergedString = MergeStrings.merge(S1, S2);

		Assertions.assertEquals("", mergedString);
	}

	@Test
	public void testMergeOneEmptyString() {
		String S1 = "abc";
		String S2 = "";

		String mergedString = MergeStrings.merge(S1, S2);

		Assertions.assertEquals("abc", mergedString);
	}
}
