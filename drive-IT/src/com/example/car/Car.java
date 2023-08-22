package com.example.car;

import com.example.wheel.Wheel;

public class Car {

	private Wheel wheel;

	public Car(Wheel wheel) {
		this.wheel = wheel;
		System.out.println("Car obj created..");
	}
	
	public void setWheel(Wheel wheel) {
		this.wheel=wheel;
	}

	public void move() {
		int rpm = wheel.rotate(50);
		System.out.println("Car Moving.." + rpm);

	}

}
