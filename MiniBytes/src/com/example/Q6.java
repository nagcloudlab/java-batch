package com.example;

public class Q6 {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		/*
		 * 
		 *  for(Type var:array/iterable-object){
		 *  
		 *  
		 *  }
		 * 
		 */

		for(int i:numbers) {
			System.out.println(i);
		}
	}

}
