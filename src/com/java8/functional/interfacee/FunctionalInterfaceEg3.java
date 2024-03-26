//In the following example, a functional interface is extending to a non-functional interface.
package com.java8.functional.interfacee;

interface Playing {
	default void cricket() {
		System.out.println("We play cricket.");
	}
}

interface Hokey extends Playing {
	void enjoyGame();
}

public class FunctionalInterfaceEg3 implements Hokey {

	public void enjoyGame() {
		System.out.println("We enjoying while playing hockey");
	}

	public static void main(String[] args) {
		FunctionalInterfaceEg3 obj3 = new FunctionalInterfaceEg3();
		obj3.enjoyGame();
		obj3.cricket();
	}
}
