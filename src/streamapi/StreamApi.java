package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {

		// Q) create a list and print all even no from list

		List<Integer> list1 = List.of(3, 4, 5, 6, 8, 9, 12, 44, 68);
//		list1.add(68);
		System.out.println("List 1:" + list1);

		List<Integer> list2 = new ArrayList<>();
		list2.add(2);
		list2.add(68);
		list2.add(1);
		list2.add(6);
		list2.add(7);
		list2.add(9);
		list2.add(22);
		list2.add(13);

		System.out.println("List 2: " + list2);

		// using aslist method

		List<Integer> list3 = Arrays.asList(78, 5, 3, 5, 6, 6, 7);
		System.out.println(list3);

		// without Stream API we find even numbers from list1

		List<Integer> listEven = new ArrayList<>();
		listEven.add(null);

		for (Integer i : list1) {

			if (i % 2 == 0) {
				listEven.add(i);
			}
		}
		System.out.println("Even Numbers" + listEven);

		// with using Stream API

		Stream<Integer> stream = list1.stream();
		List<Integer> evenList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Numbers:" + evenList);

		Stream<Integer> stream1 = list2.stream();
		List<Integer> oddList = stream1.filter(i -> i % 2 == 1).collect(Collectors.toList());
		System.out.println("Odd Numbers:" + oddList);

		List<Integer> newList1 = list1.stream().filter(i -> i > 10).collect(Collectors.toList());
		System.out.println(newList1);
		
		
		//How to create Stream Object
		
		
		Stream<Object>emptyStream=Stream.empty();
		emptyStream.forEach(e->{
			System.out.println("blank"+e);
		});
		System.out.println("kb");
		

	}

}