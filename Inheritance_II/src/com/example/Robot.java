package com.example;

public class Robot extends LivingThing {
	
	@Override
	public void eat() {
		System.out.println("Robo eat()");
	}
	
	@Override
	public void work() {
		System.out.println("Robo Work()");
	}

}
