package com.java8.javaguide.optionalclass.crash.course;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) {
		// of, empty , ofNullable these are three static method which are use to create
		// optional object

		String email = "akashsarwade@gmail.com";

//		using empty() method create object
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);

//		using .of method 
//		of method internally provides null check 
		Optional<String> emailOptional = Optional.of(email);
		System.out.println(emailOptional);

		Optional<String> StringOptional = Optional.ofNullable(email);
		System.out.println(StringOptional.get());
		// get whenever you want to retrieve a value from optional class object the we
		// can use get() method

		// isPresent()->

		if (StringOptional.isPresent()) {
			System.out.println(StringOptional.get());
		} else {
			System.out.println("No Value Present");
		}

		// orElse()
		String defaultOptional = StringOptional.orElse("defaultmail.com");

		System.out.println(defaultOptional);

//		orElseGet()

//		orElseThrow()

//		ifPresent()

		Optional<String> gender = Optional.of("Male");
		Optional<String> emptyOptional1 = Optional.empty();
		gender.ifPresent((s) -> System.out.println("value is present"));
		emptyOptional1.ifPresent((s) -> System.out.println("No value is present"));

		// filter()

	}

}
