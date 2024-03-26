package lambda.exp;

interface Sayable {
	public String say();
}

public class LambdaExprsnNoParameter {

	public static void main(String[] args) {

//	No Parameter

		Sayable s = () -> {
			return "I have nothing to say";
		};
		System.out.println(s.say());
	}
}