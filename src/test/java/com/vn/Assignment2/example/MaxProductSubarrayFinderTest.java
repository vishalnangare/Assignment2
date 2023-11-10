package com.vn.Assignment2.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.vn.Assignment2.examples.MaxProductSubarrayFinder;

public class MaxProductSubarrayFinderTest {

    @Test
    public void testMaxProduct() {
        int[] arr = {6, -3, -10, 0, 2};
        int n = arr.length;

        int expectedMaxProduct = 180; 
        int actualMaxProduct = MaxProductSubarrayFinder.maxProduct(arr, n);

        assertEquals(expectedMaxProduct, actualMaxProduct);
    }

    @Test
    public void testMaxProductEmptyArray() {
        int[] arr = {};
        int n = arr.length;

        int expectedMaxProduct = 0; 
        int actualMaxProduct = MaxProductSubarrayFinder.maxProduct(arr, n);

        assertEquals(expectedMaxProduct, actualMaxProduct);
    }

    @Test
    public void testMaxProductSingleElement() {
        int[] arr = {5};
        int n = arr.length;

        int expectedMaxProduct = 5; 
        int actualMaxProduct = MaxProductSubarrayFinder.maxProduct(arr, n);

        assertEquals(expectedMaxProduct, actualMaxProduct);
    }
}
