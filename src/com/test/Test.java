package com.test;

public class Test {

	public static void main(String[] args) {

		int i, p = 0, flag = 0;
		int n = 12;
		p = n / 2;

		if (n == 0 || n == 1) {
			System.out.println("Not prime");
		} else

		{
			for (i = 2; i <= p; i++) {
				if (n % i == 0)

				{
					System.err.println("Not Prime no");
					flag = 1;
					break;
				}

			}
			if (flag == 0) {

				System.err.println("its Prime ");

			}

		}

	}
}