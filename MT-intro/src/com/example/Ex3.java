package com.example;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

class Task3 implements Runnable {
	@Override
	public void run() {
		while (true) {
			LocalTime localTime = LocalTime.now();
			System.out.println(localTime);
			try {
				//Thread.sleep(1000);
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Ex3 {
	public static void main(String[] args) {
		Task3 task3 = new Task3();
		Thread timeThread = new Thread(task3);
		timeThread.start();
	}

}
