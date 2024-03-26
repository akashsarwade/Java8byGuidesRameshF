package com.java8.javaguide.functionalinterface.crash.course;

import java.util.function.Function;

class FunctionalImpl implements Function<String, Integer> {

	@Override
	public Integer apply(String t) {
		return t.length();
	}

}

public class FunctionalInterfaceEg2 {

	public static void main(String[] args) {

		Function<String, Integer> fun = new FunctionalImpl();// object created
		System.out.println(fun.apply("Akash"));
		
		//using Lambda Exprsn
		Function<String,Integer> fun1=(String s)->s.length();
		System.out.println(fun.apply("Sarawade"));
	}
}
