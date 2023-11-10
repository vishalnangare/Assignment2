package com.vn.Assignment2.example;

import org.junit.jupiter.api.Test;

import com.vn.Assignment2.examples.KthSmallestElement;

import org.junit.jupiter.api.Assertions;

public class KthSmallestElementTest {

    @Test
    public void testFindSmallestWithPositiveInput() {
        int[] arr = {17, 24, 6, 2, 3, 5};
        int no = 4;
        int result = KthSmallestElement.findSmallest(no, arr);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testFindSmallestWithZeroInput() {
        int[] arr = {17, 24, 6, 2, 3, 5};
        int no = 0;
        int result = KthSmallestElement.findSmallest(no, arr);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testFindSmallestWithNegativeInput() {
        int[] arr = {17, 24, 6, 2, 3, 5};
        int no = -2;
        int result = KthSmallestElement.findSmallest(no, arr);
        Assertions.assertEquals(6, result);
    }
}
