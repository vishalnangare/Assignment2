package com.vn.Assignment2.example;
import org.junit.jupiter.api.Test;

import com.vn.Assignment2.examples.UniqueFrequency;

import org.junit.jupiter.api.Assertions;

public class UniqueFrequencyTest {

    @Test
    public void testIsFrequencyUniqueWithUniqueFrequencies() {
        int[] arr1 = {1, 2, 3};
        boolean result1 = UniqueFrequency.isFrequencyUnique(arr1.length, arr1);
        Assertions.assertTrue(result1);
    }

    @Test
    public void testIsFrequencyUniqueWithNonUniqueFrequencies() {
        int[] arr2 = {1, 2, 2, 3, 3};
        boolean result2 = UniqueFrequency.isFrequencyUnique(arr2.length, arr2);
        Assertions.assertFalse(result2);
    }

    @Test
    public void testIsFrequencyUniqueWithEmptyArray() {
        int[] arr3 = {};
        boolean result3 = UniqueFrequency.isFrequencyUnique(arr3.length, arr3);
        Assertions.assertTrue(result3);
    }
}
