package streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamObjects {

	public static void main(String[] args) {
		// Stream API use for process to collection and group of object

		// How to create Stream Object

		Stream<Object> emptyStream = Stream.empty();
		emptyStream.forEach(e -> {
			System.out.println("blank" + e);
		});
		System.out.println("emptyObject Created Success");

		// 2. Array, Object, Collection

		String name[] = { "Akash", "Bindu", "Piyush", "Hari" };

		Stream<String> stream1 = Stream.of(name);
		stream1.forEach(e -> {
			System.out.println(e);
		});

		// 3.
		Stream stream = (Stream) Arrays.stream(new int[] { 3, 4, 6, 7, 2, 1, 5 });
		stream.forEach(e -> {
			System.out.println(e);
		});

		
	}
}
