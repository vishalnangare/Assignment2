package com.vn.Assignment2.examples;

public class SubsequenceChecker {
	public static int isSubsequence(String A, String B) {
		int i = 0;
		int j = 0;

		while (i < A.length() && j < B.length()) {
			if (A.charAt(i) == B.charAt(j)) { 
				i++;
			}
			j++;
		}

		return i == A.length()  ? 1 : 0;
	}

	public static void main(String[] args) {
		String A = "abc";
		String B = "ahbgdc";
		int result = isSubsequence(A, B);
		System.out.println("Is A a subsequence of B " + result);
	}
}
