package com.functional.interfece;

@FunctionalInterface
public interface FunctionalInterfaceEg {

	void m1();

	default void m2() {

		System.out.println("default method m2");

	}

	default void m3() {

		System.out.println("default method m3");

	}

	static void m4() {
		System.out.println("static method m4");
	}
	public static void main(String[] args) {
		
	}

}
