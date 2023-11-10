package com.vn.Assignment2.example;

import org.junit.jupiter.api.Test;

import com.vn.Assignment2.examples.EquilibriumPointFinder;

import org.junit.jupiter.api.Assertions;

public class EquilibriumPointFinderTest {

    @Test
    public void testEquilibriumPointWithPositiveInput() {
        int[] arr = {1, 3, 5, 2, 2};
        int n = arr.length;
        int result = EquilibriumPointFinder.equilibriumPoint(arr, n);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testEquilibriumPointWithNoEquilibrium() {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int result = EquilibriumPointFinder.equilibriumPoint(arr, n);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void testEquilibriumPointWithSingleElement() {
        int[] arr = {5};
        int n = arr.length;
        int result = EquilibriumPointFinder.equilibriumPoint(arr, n);
        Assertions.assertEquals(1, result);
    }
}
