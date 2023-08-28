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

class Task1 implements Runnable {
	@Override
	public void run() {
		// ....
		System.out.println(Thread.currentThread().getName() + " saying GM");
	}
}

public class Ex1 {

	public static void main(String[] args) {

		Thread thread = new Thread(new Task1(),"Foo");
		thread.start();

	}

}
