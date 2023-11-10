package com.vn.Assignment2.examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueFrequency {
	public static boolean isFrequencyUnique(int N, int[] arr) {
		Map<Integer, Integer> frequencyMap = new HashMap<>();

		for (int num : arr) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}

		Set<Integer> uniqueFrequencies = new HashSet<>();

		for (int frequency : frequencyMap.values()) {
			if (uniqueFrequencies.contains(frequency)) {
				return false;
			}
			uniqueFrequencies.add(frequency);
		}

		return true;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 2 };
		boolean result1 = isFrequencyUnique(arr1.length, arr1);
		System.out.println("Is frequency unique in arr1? " + result1);

	}
}
