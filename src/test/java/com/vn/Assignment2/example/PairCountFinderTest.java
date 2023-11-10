package com.vn.Assignment2.example;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.vn.Assignment2.examples.PairCountFinder;



public class PairCountFinderTest {

    @Test
    public void testGetPairsCount() {
        int[] arr = {2, 3, 2, 3};
        int n = arr.length;
        int k = 5;

        int expectedPairsCount = 3;
        int actualPairsCount = PairCountFinder.getPairsCount(arr, n, k);

        assertEquals(expectedPairsCount, actualPairsCount);
    }

    @Test
    public void testGetPairsCountEmptyArray() {
        int[] arr = {};
        int n = arr.length;
        int k = 5;

        int expectedPairsCount = 0; 
        int actualPairsCount = PairCountFinder.getPairsCount(arr, n, k);

        assertEquals(expectedPairsCount, actualPairsCount);
    }

    @Test
    public void testGetPairsCountNoPairs() {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        int k = 10;

        int expectedPairsCount = 0; 
        int actualPairsCount = PairCountFinder.getPairsCount(arr, n, k);

        assertEquals(expectedPairsCount, actualPairsCount);
    }
}
