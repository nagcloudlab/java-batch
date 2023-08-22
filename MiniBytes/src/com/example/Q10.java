package com.example;


class Vehicle{}
class Car extends Vehicle{
	public void carMethod() {
		
	}
}
class Bike extends Vehicle{
	public void bikeMethod() {
		
	}
}

public class Q10 {
	
	public static void main(String[] args) {
		
//		Car car=new Car();
//		Bike bike=new Bike();
		
		Vehicle vehicle;
		vehicle=new Car();
		vehicle=new Bike();
		
		
		if(vehicle instanceof Car) {
		Car car=(Car)vehicle;
		car.carMethod();
		}else {
			System.out.println("class cast execption");
		}
				
		
	}

}
