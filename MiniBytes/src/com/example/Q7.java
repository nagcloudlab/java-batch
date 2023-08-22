package com.example;

class Employee{
	String name;
	void doWork() {
		System.out.println("emp "+name+" working");
	}
}
public class Q7 {
	
	public static void main(String[] args) {
		Employee e=null;
		e=new Employee();
		e.name="Foo";
		e.doWork();
	}

}
