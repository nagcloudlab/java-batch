package com.example;

// Author: Trainer
public abstract class LivingThing {

	public void eat() {
		System.out.println("LT eat()");
	}

	public final void sleep() {
		System.out.println("LT sleep()");
	}

	public abstract void work();
}
