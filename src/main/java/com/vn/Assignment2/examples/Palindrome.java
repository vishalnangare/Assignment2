package com.vn.Assignment2.examples;

public class Palindrome {

	public  static String is_palindrome(int no) {
		int rem, sum = 0, temp; 
		temp = no;

		while (no > 0) { 
			rem = no % 10;
			sum = (sum * 10) + rem;

			no = no / 10;
 
		}
		if (temp == sum) {
			return " Yes";
		} else {
			return " NO";
		}

	}
	
	public static void main(String[] args) {
	int input=454;
		System.out.println("Input " + input+" OutPut " +is_palindrome(input));
	}

}
