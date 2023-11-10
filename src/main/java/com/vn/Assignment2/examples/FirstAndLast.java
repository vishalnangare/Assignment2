package com.vn.Assignment2.examples;

import java.util.Arrays;

public class FirstAndLast {

	public static int[] searchRange(int[] nums, int target) {
		int first = -1;
		int last = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				if (first == -1) {
					first = i;
				}
				last = i;

			}

		}
		return new int[] { first, last };
	}

	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 25, 1, 3 };
		int target = 2;

		int[] result = searchRange(nums, target);

		System.out.println("First and Last Positions of " + target + ": " + Arrays.toString(result));
	}
}
