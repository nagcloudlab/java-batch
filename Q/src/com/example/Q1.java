package com.example;


class A{
	public A(int a) {
		super();
		System.out.println("im A");
	}
}

class B extends A{
	public B() {
		super(12);
		System.out.println("im B");
	}
}

class C extends B{
	public C() {
		super();
		System.out.println("im C");
	}
}


public class Q1 {
	
	public static void main(String[] args) {
		
		C c=new C();
		
	}

}
