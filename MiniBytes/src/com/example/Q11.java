package com.example;

abstract class Subject{}
class Java extends Subject{
}

class JavaScript extends Subject {
}

class Trainer<T extends Subject> {
	T subject;

	public T getSubject() {
		return subject;
	}

	public void setSubject(T subject) {
		this.subject = subject;
	}

}

public class Q11 {

	public static void main(String[] args) {

		Trainer<Java> javaTrainer = new Trainer<Java>();
		javaTrainer.setSubject(new Java());
		
		//-------------------------------------------
		//javaTrainer.setSubject(new JavaScript());
		// -------------------------------------------
		// Java class-room
		// -------------------------------------------
		Java java = javaTrainer.getSubject();
		System.out.println("Happy learning..");
		
		
		//Trainer<String> trainer=new Trainer<>();
		

	}

}
