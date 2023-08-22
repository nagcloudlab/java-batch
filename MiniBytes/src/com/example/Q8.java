package com.example;


interface I1{
	void m1();
}
interface I2{
	void m1();
	void m2();
}

class C1 implements I1{
	@Override
	public void m1() {
	}
}
class C2 implements I2{
	@Override
	public void m1() {
		
	}
	@Override
	public void m2() {
		
	}
	
}

class C3 implements I1,I2{
	@Override
	public void m1() {
		
	}
	@Override
	public void m2() {
		
	}
}

public class Q8 {
	
	public static void main(String[] args) {
		
	}

}
