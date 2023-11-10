package com.vn.Assignment2.examples;
public class AddMinCharsForPalindrome {
    public static int addMinChar(String str) {
        int n = str.length();
        int minCharsToAdd = 0;
        
        for (int i = 0; i < n / 2; i++) {
        	  System.out.println("" +str.charAt(i)+   " "+ str.charAt(n - 1 - i));
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                minCharsToAdd++; 
            }
        }
        
        return minCharsToAdd;
    }

    public static void main(String[] args) {
        String str = "ABCD";
        int minChars = addMinChar(str);
        System.out.println("Minimum characters to add: " + minChars);
    }
}
