package lambda.exp;

interface Tell {
	public String Talk(String name);
}

public class LambdaExprsnSingleParameter {

	public static void main(String[] args) {

		Tell s1 = (name) -> {
			return "Hello " + name;
		};
		System.out.println(s1.Talk("Akash"));
	}
}
