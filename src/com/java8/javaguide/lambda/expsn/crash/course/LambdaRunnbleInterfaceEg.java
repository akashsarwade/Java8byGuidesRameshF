package com.java8.javaguide.lambda.expsn.crash.course;

class ThreadDemo implements Runnable {

	@Override
	public void run() {

		System.out.println("Run Method Called.....");
	}

}

public class LambdaRunnbleInterfaceEg {

	public static void main(String[] args) {
		Thread td = new Thread(new ThreadDemo());
		td.run();

		Runnable runnble = () -> {
			System.out.println("Runnable lambda function called.....");
		};
		runnble.run();
	}

}
