package com.vn.Assignment2.example;

import org.junit.jupiter.api.Test;

import com.vn.Assignment2.examples.Palindrome;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

	@Test
	public void testIsPalindrome() {
		
		int palindromeNumber = 121;
		assertEquals("Yes", Palindrome.is_palindrome(palindromeNumber));

		
		int nonPalindromeNumber = 12345;
		assertEquals("No", Palindrome.is_palindrome(nonPalindromeNumber));


		int singleDigitPalindrome = 5;
		assertEquals("Yes", Palindrome.is_palindrome(singleDigitPalindrome));
	}
}

