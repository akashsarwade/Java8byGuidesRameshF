package com.test;

public class Hello {

	public static void main(String[] args) {
		
		String a="akash";
		String b="akaash";
		String s=new String("akash");
//		equals() method check content of object
		
//		== method are use to check memory location of both objects
//		it is operator
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a.equals(s));
	}
	
}
