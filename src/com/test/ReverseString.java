package com.test;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse String Using String Concatenation
		String str = "ABCD";
		String rev = "";

		int len = str.length();// 4
		
		for (int i = len - 1; i >= 0; i--){	// i = 4-1 = 3 | 3>0 true
			rev = rev + str.charAt(i);		//rev=D
		}
		
		System.out.println("Reverse :-" + rev);
	}
}
