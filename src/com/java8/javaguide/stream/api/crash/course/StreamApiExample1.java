package com.java8.javaguide.stream.api.crash.course;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamApiExample1 {

	public static void main(String[] args) {

//		Create a Stream 
		Stream<String> stream = Stream.of("A", "K", "A", "S", "H");
		stream.forEach(System.out::println);

//		Create stream from sources

		Collection<String> collection = Arrays.asList("Akash", "Madhukar", "Sarwade", "Pune", "Maharashtra");
		Stream<String> stream2 = collection.stream();
		stream2.forEach(System.out::println);

//		create stream object from list

		List<String> list = Arrays.asList("J2EE", "HIBERNATE", "SPRING", "BOOT", "JSON");
		Stream<String> stream3 = list.stream();
		stream3.forEach(System.out::println);

//		create stream object from Set

		Set<String> set = new HashSet<>(list);
		Stream<String> stream4 = set.stream();
		stream4.forEach(System.out::println);

		String[] strArray = { "a", "b", "c", "d", "e", "f", "g", "h" };
		Stream<String> stream5 = Arrays.stream(strArray);
		stream5.forEach(System.out::println);

	}
}
