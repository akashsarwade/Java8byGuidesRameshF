package com.test;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number");

		int num = sc.nextInt();

//		int rev = 0;
//		
//		while (num != 0) {
//			rev = rev * 10 + num % 10;
//			num = num / 10;
//		}
//		System.out.println("Reverse Number is:" + rev);

		// 2 using String Buffer class reverse method
		
		StringBuffer reverse;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		reverse = sb.reverse();
		System.out.println("Reverse Number is:" + reverse);

	}

}
