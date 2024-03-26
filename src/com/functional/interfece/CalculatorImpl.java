package com.functional.interfece;

interface Calculator {
//	 this is abstract method
//1.	void switchOn();

//2.	void add(int a);

//3.
	int Sub(int a, int b);

}

public class CalculatorImpl {

	// (parameter) -> {body }

	public static void main(String[] args) {
		/*
		 * 1. Implementation Calculator cal = () ->
		 * System.out.println("Switch On Success"); cal.switchOn();
		 */
		
		
		/*
		 * 2. implementation
		 * 
		 * Calculator sum = (int a) -> { System.out.println(a); }; sum.add(67 + 67);
		 */
		
		
		
		/*3. Implementation
		 * Calculator s = (a, b) -> 
		 * {
		 *  return a - b; 
		 * }; 
		 * System.out.println(s.Sub(100, 50));
		 */
		
		
		/*4. implementation
		 * 
		 * Calculator s1 = (a, b) -> { if (a < b) { throw new
		 * RuntimeException("Message");
		 * 
		 * } else { return a - b; }
		 * 
		 * }; System.out.println(s.Sub(100, 50));
		 */
	
	
	}
	

}
