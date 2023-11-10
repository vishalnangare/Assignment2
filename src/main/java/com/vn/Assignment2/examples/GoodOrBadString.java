package com.vn.Assignment2.examples;

public class GoodOrBadString {
	public static int isGoodOrBad(String S) {
		int consecutiveConsonants = 0;
		int consecutiveVowels = 0;

		String vowels = "aeiou";

		for (char c : S.toCharArray()) {
			char lowercaseChar = Character.toLowerCase(c);

			if (lowercaseChar == '?') {

				consecutiveConsonants++;
				consecutiveVowels++;
			} else if (vowels.indexOf(lowercaseChar) >= 0) {
				consecutiveConsonants = 0;
				consecutiveVowels++;
			} else {
				consecutiveVowels = 0;
				consecutiveConsonants++;
			}

			if (consecutiveConsonants > 3 || consecutiveVowels > 5) {

				return 0;
			}
		}

		return 1;
	}

	public static void main(String[] args) {
		String S1 = "bcdaeiou??";
		int result1 = isGoodOrBad(S1);
		System.out.println("String 1 is " + result1);

		String S2 = "aeioup??";
		int result2 = isGoodOrBad(S2);
		System.out.println("String 2 is " + result2);
	}
}
