package com.example;

import com.example.car.Car;
import com.example.wheel.CEATWheel;
import com.example.wheel.JKWheel;
import com.example.wheel.MRFWheel;
import com.example.wheel.Wheel;

public class Application {
	
	public static void main(String[] args) {
		
		Wheel mrfWheel=new MRFWheel();
		Car car=new Car(mrfWheel);
		
		System.out.println("-".repeat(50));
		
		car.move();
		
		System.out.println("-".repeat(50));
		
		car.move();
		
		System.out.println("-".repeat(50));
		
		car.setWheel(new CEATWheel());
		car.move();
		
		System.out.println("-".repeat(50));
		
		car.setWheel(new JKWheel());
		car.move();
		
		
		
	}

}
