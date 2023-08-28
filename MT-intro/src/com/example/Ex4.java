package com.example;

import java.util.concurrent.TimeUnit;

class TrainerTask implements Runnable {
	@Override
	public void run() {
		System.out.println("trainer finding solution..");
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("trainer given solution");
	}
}
class EmployeeTask implements Runnable {
	@Override
	public void run() {
		System.out.println("employee learning java...");
		System.out.println("employee got error/doubt");
		Thread trainerThread = new Thread(new TrainerTask());
		trainerThread.start();
		try {
			trainerThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("employee resume further learning after treainerThread");
	}
}

public class Ex4 {

	public static void main(String[] args) {

		Thread employeeThread = new Thread(new EmployeeTask());
		employeeThread.start();

	}

}
