package com.java8.method.reference;

import java.util.function.BiFunction;

class Arithmatic {

	public int add(int a, int b) {
		return a + b;
	}
}

public class InstanceMethodReference2 {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder = new Arithmatic()::add;
		int res = adder.apply(100, 435);
		System.out.println("Addition is:" + res);
	}
}
