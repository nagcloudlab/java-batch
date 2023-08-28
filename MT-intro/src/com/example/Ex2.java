package com.example;
class Task2 implements Runnable {
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		for (int i = 0; i < 100; i++) {
			System.out.println(threadName + "->" + i);
		}
		// -> TERMINATED
	}
}
public class Ex2 {
	public static void main(String[] args) {
		Task2 task2 = new Task2();
		Thread fooThread = new Thread(task2, "foo"); // NEW
		Thread barThread = new Thread(task2, "bar");
		Thread bazThread = new Thread(task2, "baz");
		fooThread.start(); // NEW -> RUNNABLE
		barThread.start();
		bazThread.start();

	}

}
