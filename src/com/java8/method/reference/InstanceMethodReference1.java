//like static methods, you can refer instance methods also. In the following example, we are describing the process of referring the instance method.

package com.java8.method.reference;

interface Hello {
	void say();
}

public class InstanceMethodReference1 {

	public void saySomething() {
		System.out.println("This is non static method.");
	}

	public static void main(String[] args) {
		InstanceMethodReference1 irm = new InstanceMethodReference1();// creating Object
		// Referring non static method
		Sayable sayable = irm::saySomething;
		sayable.say();

		// Referring non-static method using anonymous object

		Sayable sayable2 = new InstanceMethodReference1()::saySomething;
		sayable2.say();

	}
}
