package com.example;

import java.util.Arrays;

public class Q3 {
	
	public static void main(String... args) {
		
		display1(new int[] {1,2,3,4});
		display2(1,2,3,4,5);
		
	}

	private static void display1(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	private static void display2(int... numbers ) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
