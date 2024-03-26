package com.java8.method.reference;

interface Messageable {
	Message getMsg(String msg);
}

class Message {
	Message(String msg) {
		System.out.println(msg);
	}
}

public class ConstructorMethodReference1 {

	public static void main(String[] args) {
		Messageable hello = Message::new;
		hello.getMsg("Welcome thi is msg..");
	}
}
