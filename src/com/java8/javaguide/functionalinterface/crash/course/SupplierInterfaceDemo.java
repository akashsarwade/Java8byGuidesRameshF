package com.java8.javaguide.functionalinterface.crash.course;

import java.time.LocalDateTime;
import java.util.function.Supplier;

class SupplierImpl implements Supplier<LocalDateTime> {

	@Override
	public LocalDateTime get() {
		return LocalDateTime.now();// return current date and time
	}

}

public class SupplierInterfaceDemo {

	public static void main(String[] args) {

		Supplier supplier = new SupplierImpl();// obj creation
		System.out.println(supplier.get());// return time and date

		// using Lambda Expression

		Supplier<LocalDateTime> sp = () -> LocalDateTime.now();
		System.out.println(supplier.get());

		System.out.println(sp.get());
	}
}
