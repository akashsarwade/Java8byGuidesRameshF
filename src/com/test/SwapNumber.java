package com.test;

public class SwapNumber {

	public static void main(String[] args) {

		int a = 10;
		int b = 34;

//		a = a + b;
//		b = a + b;
//		a = a + b;
//		System.out.println(a + " " + b);

		// 1. With using 3rd Variable

		int t;
		t = a;
		a = b;
		b = t;

		System.out.println(a + " " + b);

		// 2. Without Using 3rd Variable

		a = a + b;// 10+34=44
		b = a - b;// 44-34=10
		a = a - b;// 44-10=34

		System.out.println("swapped sing + and - :" + a + " " + b);

		// 3 Using * and ? operator

		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("swapped using * and / :" + a + " " + b);

		// 4. Using Bitwise XOR (^) operator

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("swapped using XOR ^ :" + a + " " + b);

		// 5.
		b = a + b - (a = b);
		System.out.println("swapped using Single Statement right to left :" + a + " " + b);
	}

}
