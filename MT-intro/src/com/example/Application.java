package com.example;

import java.util.Scanner;

/*
 * 
 *  s/w
 *  
 *  	 2 types of tasks
 *      
 *       task1 : computation
 *       task2 : IO
 * 
 */

public class Application {
	
	private static void io() {
		System.out.println(Thread.currentThread().getName()+" started IO");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Say your name!");
		String name=scanner.nextLine();
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()+" started");
		io();
		
	}

	

}
