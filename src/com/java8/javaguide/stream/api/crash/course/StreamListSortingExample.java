package com.java8.javaguide.stream.api.crash.course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSortingExample {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();
		fruits.add("BANANA");
		fruits.add("ORANGE");
		fruits.add("PAPAYA");
		fruits.add("CHIKOO");
		fruits.add("APPLE");
		fruits.add("GREPS");
//		we converted list into stream we have sorted method to stream in ascending order
		List<String> sortedList = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println("Sorted in Ascending Order" + sortedList);

		List<String> sortedList1 = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println(sortedList1);

//		descending Order
		List<String> descsortedList = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Sorted in Descending Order" + descsortedList);

		List<String> descSortedList2 = fruits.stream().sorted((o1, o2) -> o2.compareTo(o1))
				.collect(Collectors.toList());
		System.out.println(descSortedList2);

		// Sort employee by salary in Ascending order

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(120, "Akash Sarwade", 30900));
		empList.add(new Employee(120, "Shamala M", 43899));
		empList.add(new Employee(120, "Vikas Sharma", 26490));
		empList.add(new Employee(120, "Rutu Patil", 78642));
		empList.add(new Employee(120, "Pradip pawar", 23467));
		empList.add(new Employee(120, "Vaibhav Jain", 55256));
		empList.add(new Employee(120, "Lakshmi ayyar", 89768));

		// how to sort employee by their salary
		// first convert employee object to stream comparator provide compare method
		List<Employee> sortedBySal = empList.stream().sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {

				return (o1.getSalary() - o2.getSalary());
			}
		}).collect(Collectors.toList());
		System.out.println(sortedBySal);

		List<Employee> sortedBySal1 = empList.stream().sorted(Comparator.comparingInt(Employee::getSalary))
				.collect(Collectors.toList());
		System.out.println(sortedBySal1);

		List<Employee> sortedBySal2 = empList.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed())
				.collect(Collectors.toList());
		System.out.println("Reversed Order" + sortedBySal2);

		// get name by ascending order
		List<Employee> nameByAscending = empList.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		System.out.println("Reversed Order" + nameByAscending);

		// get name by descending order
		List<Employee> nameByDescending = empList.stream().sorted(Comparator.comparing(Employee::getName).reversed())
				.collect(Collectors.toList());
		System.out.println("Reversed Order" + nameByDescending);

	}
}
