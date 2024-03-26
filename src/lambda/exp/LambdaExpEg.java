package lambda.exp;

interface drawable {

	public void draw();// method declaration
}

public class LambdaExpEg {
	public static void main(String[] args) {

		int width = 10;

		drawable d = new drawable() {

			@Override
			// method implementation
			public void draw() {

				System.out.println("Drawing: " + width);
			}
		};
		d.draw(); // calling method

		// using Lambda Expression

		drawable d2 = () -> {
			System.out.println("Drawing: "+width);
		};
		d2.draw();

	}
}
