package com.vn.Assignment2.examples;

public class EquilibriumPointFinder {
    public static int equilibriumPoint(int[] arr, int n) {
        if (n == 1) {
            return 1; 
        }

        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        leftSum[0] = arr[0];
        rightSum[n - 1] = arr[n - 1];

       
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + arr[i];
        }

        
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            if (leftSum[i] == rightSum[i]) {
                return i + 1; 
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,2,2};
        int n = arr.length;

        int equilibrium = equilibriumPoint(arr, n);
        if (equilibrium != -1) {
            System.out.println("Equilibrium Point is at index " + equilibrium);
        } else {
            System.out.println("No Equilibrium Point found.");
        }
    }
}
