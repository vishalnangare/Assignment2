package com.vn.Assignment2.examples;

public class PairCountFinder {
    public static int getPairsCount(int[] arr, int n, int k) {
        int pairCount = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    pairCount++;
                }
            }
        }

        return pairCount;
    }

    public static void main(String[] args) {
		int[] arr = {2,3,2,3};
        int n = arr.length;
        int k = 5;

        int pairsCount = getPairsCount(arr, n, k);
        System.out.println("Number of pairs with sum " + k + ": " + pairsCount);
    }
}
