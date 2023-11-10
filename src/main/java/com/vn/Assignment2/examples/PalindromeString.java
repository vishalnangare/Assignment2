package com.vn.Assignment2.examples;

public class PalindromeString {

	public static int palindromeString(String str)
	{
		String rev=""; 
		int flag=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str))
		{
			flag=1;
		}
		return flag;
			
	}
	public static void main(String[] args) {
		String str="aao";
		int result=palindromeString(str);
		
		System.out.println("Input: str = \"" + str + "\" Output: " + result + 
				" Explanation: str is a " + (result == 1 ? "palindrome" : "not a palindrome"));
    
	}
	
}
