package com.vn.Assignment2.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.vn.Assignment2.examples.SubsequenceChecker;


public class SubsequenceCheckerTest {

    @Test
    public void testIsSubsequenceWhenAIsSubsequenceOfB() {
        String A = "abc";
        String B = "ahbgdc";
        int expected = 1;
 
        int result = SubsequenceChecker.isSubsequence(A, B);

        assertEquals(expected, result);
    }

  
   
}
