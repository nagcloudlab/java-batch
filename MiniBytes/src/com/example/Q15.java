package com.example;

class Abc {

	static int staVar;

	static {
		System.out.println("Abc : static block");
		staVar = 123;
	}
	
	{
		System.out.println("Abc : instance block");
	}

	static void staMethod() {
		System.out.println(staVar);
	}

}

public class Q15 {

	public static void main(String[] args) {

		Abc.staMethod();
		
		new Abc();
		new Abc();

	}

}
