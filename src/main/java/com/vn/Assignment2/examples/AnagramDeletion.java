package com.vn.Assignment2.examples;

import static java.lang.Math.abs;

public class AnagramDeletion {

	public static void anagramDeletion(String t, String s) {
		int count1[] = new int[26];
		int count2[] = new int[26];
		for (int i = 0; i < 26; i++) {
			count1[i] = 0;
			count2[i] = 0;
		}
		for (int i = 0; i < s.length(); i++) {
			count1[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < t.length(); i++) {
			count2[t.charAt(i) - 'a']++;
		}
		int ans = 0;
		for (int i = 0; i < 26; i++) {
			ans += abs(count1[i] - count2[i]);
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		String s = "heta";
		String t = "hea";
		anagramDeletion(s, t);

	}
}
