package com.java8.javaguide.functionalinterface.crash.course;

class ThreadDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("Run() method called......");
	}

}

public class RunnableFuncInterfaceDemo {

	public static void main(String[] args) {
		Thread td = new Thread(new ThreadDemo());
//		td.run();
		td.start();

		Runnable runnble = () -> {
			System.out.println("Run method called using Lambda Expresion");

		};
		Thread tdLambda = new Thread(runnble);
		runnble.run();
		tdLambda.start();

	}
}
