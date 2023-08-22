package com.example;

interface Wheel {
	void rotate();
}

abstract class MRFWheel{}
class MRF2Wheel extends MRFWheel implements Wheel {
	public void rotate() {
		System.out.println("MRF Wheel rotating");
	}
}
class MRF4Wheel extends MRFWheel implements Wheel {
	public void rotate() {
		System.out.println("MRF Wheel rotating");
	}
}

class CEATWheel implements Wheel {
	@Override
	public void rotate() {
		System.out.println("CEATWheel Wheel rotating");
	}
}

class Car {
	Wheel wheel;

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public void move() {
		this.wheel.rotate();
		System.out.println("Car Moving..");
	}
}

public class Ex2 {

	public static void main(String[] args) {

		Car car = new Car();

		MRF4Wheel mrfWheel = new MRF4Wheel();
		car.setWheel(mrfWheel);
		car.move();

		CEATWheel ceatWheel = new CEATWheel();
		car.setWheel(ceatWheel);
		car.move();

	}

}
