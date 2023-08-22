package com.example;

class X{
	int v=12;
	void m1() {
		System.out.println("m1()");
	}
}

class Y extends X{
	int v=13;
	public void display() {
		System.out.println(v);
		System.out.println(super.v);
	}
	void m1() {
		System.out.println("m1()");
		super.m1();
	}
}

public class Q2 {
	
	public static void main(String[] args) {
		
		Y y=new Y();
		y.display();
		
	}

}
