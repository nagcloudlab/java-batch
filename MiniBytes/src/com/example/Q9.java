package com.example;

interface I{
	void m1();
	void m2();
	void m3();
}

abstract class A implements I{
	public void m1() {
		
	}
	public void m2() {
		
	}
}

class B extends A{
	@Override
	public void m3() {
		
	}
}

public class Q9 {

}
