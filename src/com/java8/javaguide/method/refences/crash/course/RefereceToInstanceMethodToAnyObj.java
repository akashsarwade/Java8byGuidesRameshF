package com.java8.javaguide.method.refences.crash.course;

import java.util.Arrays;
import java.util.function.Function;

@FunctionalInterface
interface Printable {

	void print(String msg);
}

public class RefereceToInstanceMethodToAnyObj {

	public void display(String msg) {
		msg = msg.toUpperCase();
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// 2 method reference to an instance method of an object

		RefereceToInstanceMethodToAnyObj obj = new RefereceToInstanceMethodToAnyObj();

		// Lambda expression
		Printable printable1 = (msg) -> obj.display(msg);
		printable1.print("Hello Java 8");

		// using method reference
		Printable printableMhdRef = obj::display;// calling display method to obje of class
		printableMhdRef.print("Welcome to Pune At DXC Technology");

		/*
		 * 3. Reference to the instance method of an arbitary object some time we call a
		 * method of argument in the lambda expression in that case we can use a method
		 * reference to call an instance method of an arbitary of a specific type
		 */
		// using lambda expression
		Function<String, String> strFun = (String inp) -> inp.toLowerCase();// converting uppercase to lowercase
		System.out.println(strFun.apply("DXC TECHNOLOGY BANGLORE"));

		// using method reference
		Function<String, String> strFunMthdRef = String::toLowerCase;
		System.out.println(strFunMthdRef.apply("SARWADE AKASH"));

		String[] stryArray = { "A", "B", "C", "E", "F", "G", "H", "I", "J", "K" };
		Arrays.sort(stryArray, (s1, s2) -> s1.compareTo(s2));
		
		
	}
}
