package com.java8.functional.interfacee;

@FunctionalInterface
interface Sayable {
	// abstract method
	void say(String msg);

	// It can contain any number of Object class methods.

	int hashCode();

	String toString();

	boolean equals(Object ob);
}

public class FunctionalInterfaceEg2 implements Sayable {

	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaceEg2 obj2 = new FunctionalInterfaceEg2();
		obj2.say("Welcome to Functional Interface");
	}

}
