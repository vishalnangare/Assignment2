package com.vn.Assignment2.example;

import org.junit.jupiter.api.Test;

import com.vn.Assignment2.examples.MissingNumber;

import org.junit.jupiter.api.Assertions;

public class MissingNumberTest {

    @Test
    public void testMissingNumberWithOneMissing() {
        int[] arr = {1, 2, 3, 5};
        int N = 5;
        int result = MissingNumber.missingNumber(arr, N);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void testMissingNumberWithNoMissing() {
        int[] arr = {1, 2, 3, 4, 5};
        int N = 5;
        int result = MissingNumber.missingNumber(arr, N);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testMissingNumberWithMultipleMissing() {
        int[] arr = {1, 3, 4, 5};
        int N = 5;
        int result = MissingNumber.missingNumber(arr, N);
        Assertions.assertEquals(2, result);
    }
}
