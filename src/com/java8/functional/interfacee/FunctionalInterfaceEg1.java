/*An Interface that contains exactly one abstract method is known as functional interface.
It can have any number of default, static methods but can contain only one abstract method. 
It can also declare methods of object class.
Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces.
It is a new feature in Java, which helps to achieve functional programming approach.
*/

package com.java8.functional.interfacee;

@FunctionalInterface
interface Vehicle {
	// this is abstract method
	void start(String msg);
}

public class FunctionalInterfaceEg1 {

	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaceEg1 fie = new FunctionalInterfaceEg1();
		fie.say("Hello. Are you there.......?");
	}
}
