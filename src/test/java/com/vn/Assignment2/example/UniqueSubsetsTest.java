package com.vn.Assignment2.example;

import org.junit.jupiter.api.Test;

import com.vn.Assignment2.examples.UniqueSubsets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueSubsetsTest {

    @Test
    public void testAllSubsets() {
        int[] arr = {2, 4, 8};
        int N = arr.length;

        List<List<Integer>> expectedSubsets = new ArrayList<>();
        expectedSubsets.add(new ArrayList<>()); // Empty subset
        expectedSubsets.add(Arrays.asList(2));
        expectedSubsets.add(Arrays.asList(4));
        expectedSubsets.add(Arrays.asList(2, 4));
        expectedSubsets.add(Arrays.asList(8));
        expectedSubsets.add(Arrays.asList(2, 8));
        expectedSubsets.add(Arrays.asList(4, 8));
        expectedSubsets.add(Arrays.asList(2, 4, 8));

        List<List<Integer>> subsets = UniqueSubsets.allSubsets(arr, N);

        assertEquals(expectedSubsets.size(), subsets.size()); 

        for (List<Integer> subset : expectedSubsets) {
            assertTrue(subsets.contains(subset));
        }
    }
}
