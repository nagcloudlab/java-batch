package com.example;

enum Gender{
	MALE,FEMALE;
	public void m1() {
		System.out.println("M1");
	}
}

class E{
	String name;
	Gender gender;
}

public class Ex {
	
	
	public static void main(String[] args) {
		
		E e=new E();
		e.name="Nag";
		e.gender=Gender.MALE;
		
		Gender.MALE.m1();
		
		System.out.println(Gender.MALE.ordinal());
		System.out.println(Gender.MALE.toString());
		
	}

}
