package com.example;


class P{
	int i=10;
	public void printValue() {
		System.out.println("Value-A");
	}
}
class Q extends P{
	int i=12;
	public void printValue() {
		System.out.println("Value-B");
	}
}

public class Q13 {
	
	public static void main(String[] args) {
		
		P p=new Q();
		p.printValue();
		System.out.println(p.i);
		
	}

}
