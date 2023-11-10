package com.vn.Assignment2.examples;

public class PappuChangeCalculator {
	public static int maxExtraAmount(int actualAmount) {

		String amountStr = String.valueOf(actualAmount);

		String s1=amountStr.replace('6','9');
		int maxExtraAmount = Integer.parseInt(s1);

		return maxExtraAmount - actualAmount;
	}

	public static void main(String[] args) {
		int actualAmount = 56;
		int extraAmount = maxExtraAmount(actualAmount);
		System.out.println("Maximum possible extra amount: " + extraAmount);
	}
}
