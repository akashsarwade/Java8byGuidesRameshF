//Reference to a static method.
package com.java8.method.reference;

public class StaticMethodReference2 {

	public static void ThreadStatus() {
		System.out.println("Thread is Running.....");
	}

	public static void main(String[] args) {
		Thread td = new Thread(StaticMethodReference2::ThreadStatus);
		td.start();
	}
}
