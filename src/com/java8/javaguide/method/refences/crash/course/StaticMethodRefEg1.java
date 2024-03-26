package com.java8.javaguide.method.refences.crash.course;

import java.util.function.BiFunction;
import java.util.function.Function;

public class StaticMethodRefEg1 {

	public static int addition(int a, int b) {
		return (a + b);
	}

	public static void main(String[] args) {

		// 1. Method reference to a static method
		// using Lambda expression
		Function<Integer, Double> func = (input) -> Math.sqrt(input);
		System.out.println(func.apply(16));

		// using method reference
		Function<Integer, Double> funcMethdRef = Math::sqrt;
		System.out.println("Square root of :" + funcMethdRef.apply(99));// call method

		// 2. Lambda Expression
		BiFunction<Integer, Integer, Integer> biFun = (a, b) -> StaticMethodRefEg1.addition(a, b);
		System.out.println("Addition is:" + biFun.apply(12, 14));

		// using method reference
		BiFunction<Integer, Integer, Integer> biFunMethdRef2 = StaticMethodRefEg1::addition;
		System.out.println(biFunMethdRef2.apply(232, 112));

	}

}
