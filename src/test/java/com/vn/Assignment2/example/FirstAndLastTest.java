package com.vn.Assignment2.example;

import org.junit.jupiter.api.Test;

import com.vn.Assignment2.examples.FirstAndLast; 

import org.junit.jupiter.api.Assertions;

public class FirstAndLastTest {

    @Test
    public void testSearchRange() {
        int[] nums = {2, 0, 2, 25, 1, 3};
        int target = 2;

        int[] result = FirstAndLast.searchRange(nums, target);

       
        Assertions.assertArrayEquals(new int[]{0, 2}, result);
    }
}
