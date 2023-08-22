package com.example;


class Person{
	static int helloCount=0; // instance var
	String name;
	//int helloCount=0; // instance var
	public Person(String name) {
		super();
		this.name = name;
	}
	public void sayHello() {
		//int helloCount=0; // local var
		helloCount++;
		System.out.println(name+" -> hello "+helloCount);
	}
}

public class Ex2 {
	
	public static void main(String[] args) {
		
		// By Scope/Life
		
		// 1. class / static
		// 2. object / instance
		// 3. local
		
		Person person1=new Person("Foo");
		Person person2=new Person("Bar");
		
		person1.sayHello();
		person1.sayHello();
		person2.sayHello();
		
	}

}
