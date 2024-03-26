package lambda.exp;

import java.util.ArrayList;
import java.util.List;

interface Abc {
	int add(int a, int b);
}

interface Adable {
	String say(String msg);
}

public class LambdaExprsnMultipleParameter {

	public static void main(String[] args) {
		// 1. multiple parameter with Lambda Expression
		Abc n = (a, b) -> (a + b);
		System.out.println(n.add(10, 200));

		// 2. multiple parameter with data type in lambda expression

		Abc n1 = (int a, int b) -> (a + b);
		System.out.println(n1.add(200, 110));

		// 3. Lambda expression without return keyword.

		Abc n2 = (a, b) -> (a + b);
		System.out.println(n2.add(33, 22));

		// 4. Lambda expression with return keyword.

		Abc n3 = (int a, int b) -> {
			return a + b;

		};
		System.out.println(n3.add(98, 99));

		// 5. Java Lambda Expression Example: Foreach Loop

		List<String> l = new ArrayList<String>();
		l.add("Ankit");
		l.add("Priya");
		l.add("Orange");
		l.add("Mango");
		l.add("Banana");
		l.add("Chilly");

		l.forEach((m) -> System.out.println(m));

		// 6. Java Lambda Expression Example: Multiple Statements

		Adable person = (msg) -> {
			String str1 = "I would like to save";
			String str2 = str1 + msg;
			return str2;
		};
		System.out.println(person.say("time is precious"));
	}
}