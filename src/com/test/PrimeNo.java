package com.test;

public class PrimeNo {
	public static void main(String[] args) {

		int num, i, count = 0;
		int s = 22;
		num = s;
		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
				break;

			}

		}
		if (count == 0)
			System.out.println("its Prime no");

		else
			System.out.println("Not prime number");
	}

}
