package com.vn.Assignment2.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.vn.Assignment2.examples.Countsubsets;

public class CountSubsetsTest {

    @Test
    public void testCountSubsets() {
        int[] arr = {2, 4, 8};
        int N = arr.length;
        int expectedCount = 7;  // The expected count of subsets for this input

        int result = Countsubsets.countSubsets(arr, N);

        assertEquals(expectedCount, result);
    }
}
