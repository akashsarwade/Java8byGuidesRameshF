
package com.java8.javaguide.functionalinterface.crash.course;

@FunctionalInterface
interface MyInterface {

	// this is abstract method it will be only one in functional interface
	public void m1();

	public default void print1() {
		System.out.println("This is default method which allow in functional interface");
	}

	public static void staticPrint() {
		System.out.println("THis is static method in functional interface it can multiple methods in");
	}

}

public class FunctionalInterfaceEg1 {

	public static void main(String[] args) {
		MyInterface mi = () -> {
			System.out.println("THis is implementation of abstract method using lambda function.");
		};
		mi.m1();// abstract method called
		MyInterface.staticPrint();// using interface name i am calling static method
		mi.print1();// calling default method using refVariable of interface
	}
}
