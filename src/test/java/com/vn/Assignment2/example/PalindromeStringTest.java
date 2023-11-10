package com.vn.Assignment2.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.vn.Assignment2.examples.PalindromeString;

public class PalindromeStringTest {

	@Test
	public void testPalindrome() {
		String str1 = "abba";
		int result1 = PalindromeString.palindromeString(str1);
		assertEquals(1, result1);
	}

	@Test
	public void testNonPalindrome() {
		String str2 = "abc";
		int result2 = PalindromeString.palindromeString(str2);
		assertEquals(0, result2);
	}

	@Test
	public void testEmptyString() {
		String str3 = "";
		int result3 = PalindromeString.palindromeString(str3);
		assertEquals(1, result3);
	}
}
