package com.example.wheel;

public class MRFWheel implements Wheel {
	
	public MRFWheel() {
		System.out.println("MRFWheel object created..");
	}
	
	public int rotate(int speed) {
		System.out.println("MRFWheel rotating");
		return 100;
	}

}
