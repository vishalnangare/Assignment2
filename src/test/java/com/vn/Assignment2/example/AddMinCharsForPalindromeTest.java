package com.vn.Assignment2.example;

import org.junit.jupiter.api.Test;

import com.vn.Assignment2.examples.AddMinCharsForPalindrome;

import org.junit.jupiter.api.Assertions;

public class AddMinCharsForPalindromeTest {

    @Test
    public void testAddMinCharWithPalindrome() {
        String str = "aba";
        int result = AddMinCharsForPalindrome.addMinChar(str);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testAddMinCharWithNonPalindrome() {
        String str = "ABCD";
        int result = AddMinCharsForPalindrome.addMinChar(str);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testAddMinCharWithEmptyString() {
        String str = "";
        int result = AddMinCharsForPalindrome.addMinChar(str);
        Assertions.assertEquals(0, result);
    }
}
