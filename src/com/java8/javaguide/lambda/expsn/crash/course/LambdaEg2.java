package com.java8.javaguide.lambda.expsn.crash.course;

@FunctionalInterface
interface Addble {
	int addition(int a, int b);
}

class AddbleImpl implements Addble {

	@Override
	public int addition(int a, int b) {
		return a + b;
	}

}

public class LambdaEg2 {

	public static void main(String[] args) {
		// how to pass parameter to lambda expression
		// her no need to provide

		Addble add = (int a, int b) -> (a + b);
//			return a + b;
		int res = add.addition(222, 345);
		System.out.println(res);

		// 2. writing Lambda expression to above method
		Addble adb = (int a, int b) -> {
			int c = a * b;
			return c;
		};
		int cc = adb.addition(23, 4);
		System.out.println(cc);

	}
}
