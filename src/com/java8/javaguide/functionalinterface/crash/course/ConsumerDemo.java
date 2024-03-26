
package com.java8.javaguide.functionalinterface.crash.course;

import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String> {

	@Override
	public void accept(String t) {

		System.out.println(t);
	}

}

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer obj = new ConsumerImpl();// object created
		obj.accept("Hello Consumer.");

		// using lambda expression use consumer interface
		Consumer<String> consu = (String s) -> {
			System.out.println(s);
		};
		consu.accept("Consumer method accept() called");

	}
}
