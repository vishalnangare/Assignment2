package com.vn.Assignment2.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueSubsets {
	public static List<List<Integer>> allSubsets(int[] arr, int N) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> currentSubset = new ArrayList<>();

		Arrays.sort(arr);

		generateSubsets(arr, 0, N, currentSubset, result);

		return result;
	}

	private static void generateSubsets(int[] arr, int index, int N, List<Integer> currentSubset,
			List<List<Integer>> result) {
		if (index == N) {
			result.add(new ArrayList<>(currentSubset));
			return;
		}

		currentSubset.add(arr[index]);
		generateSubsets(arr, index + 1, N, currentSubset, result);

		currentSubset.remove(currentSubset.size() - 1);
		while (index < N - 1 && arr[index] == arr[index + 1]) {
			index++;
		}

		generateSubsets(arr, index + 1, N, currentSubset, result);
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 8 };
		int N = arr.length;

		List<List<Integer>> subsets = allSubsets(arr, N);
		for (List<Integer> subset : subsets) {
			System.out.println(subset);
		}
	}
}
