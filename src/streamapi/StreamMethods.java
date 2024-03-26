package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

	public static void main(String[] args) {

		// Stream Methods

//		filter(Predicate)
//			boolean value function
//			e-> e>10

//		map function
//		each element  operation performe

		List<String> names = List.of("Akash", "Vinay", "Sameer", "Shiva", "Trisha", "Vinita");
		List<String> newNames = names.stream().filter(e -> e.startsWith("V")).collect(Collectors.toList());
		System.out.println(newNames);

		List<Integer> num = List.of(2, 4, 6, 3, 7, 8, 9);
		List<Integer> newNum = num.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println(newNum);

		names.stream().forEach(e -> {
			System.out.println(e);
		});

		newNames.stream().forEach(System.out::println);

		// using forEach method

		List<Integer> l1 = Arrays.asList(2, 5, 61, 3, 7, 82, 91);
		Stream<Integer> data = l1.stream();
//		data.forEach(n -> System.out.println(n));

		Stream<Integer> sortedData = data.sorted();
		sortedData.forEach(s -> System.out.println(s));

	}

}