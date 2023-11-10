package com.vn.Assignment2.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.vn.Assignment2.examples.ImmediateSmaller;

public class ImmediateSmallerTest { 

    @Test
    public void testImmediateSmaller() {
        int[] arr = {4, 2, 1, 5, 3};
        int n = arr.length;

        int[] expectedArr = {2, 1, -1, 3, -1}; // The expected modified array

        ImmediateSmaller.ImmediateSmaller(arr, n);

        assertArrayEquals(expectedArr, arr);
    }
}
