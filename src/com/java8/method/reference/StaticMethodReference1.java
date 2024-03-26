//Reference to a static method.
package com.java8.method.reference;
interface Sayable {

	void say();
}

public class StaticMethodReference1 {

	public static void saySomethig() {
		System.out.println("Hello, THis is Static Method");
	}

	public static void main(String[] args) {
		Sayable sble = StaticMethodReference1::saySomethig;
		sble.say();
	}
}
