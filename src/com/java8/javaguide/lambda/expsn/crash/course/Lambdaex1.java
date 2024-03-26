package com.java8.javaguide.lambda.expsn.crash.course;

@FunctionalInterface
interface Shape {
	public void draw();
}

public class Lambdaex1 {

	public static void main(String[] args) {

		// we can convert methods into lambda expression

		Shape circle = () -> System.out.println("Circle Draw");
		circle.draw();

		Shape rectangle = () -> System.out.println("Rectangle Shape Draw..");
		rectangle.draw();

		Shape hexagone = () -> System.out.println("Hexagone shape Draw");
		hexagone.draw();
		
		//pass lambda expression to method
		print(hexagone);
		print(circle);
		print(rectangle);
		
	}

	private static void print(Shape shape) {
		shape.draw();
	}

}
