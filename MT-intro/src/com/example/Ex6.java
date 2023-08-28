package com.example;

import java.util.concurrent.TimeUnit;

class Building {
	private static Object key = new Object();

	public void room1() throws InterruptedException {
		synchronized (key) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " entering room-1");
			TimeUnit.SECONDS.sleep(3);
			System.out.println(threadName + " leaving room-1");
		}
	}

	public void room2() throws InterruptedException {
		synchronized (key) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " entering room-2");
			TimeUnit.SECONDS.sleep(3);
			System.out.println(threadName + " leaving room-2");
		}
	}
}

public class Ex6 {
	public static void main(String[] args) {
		Building building1 = new Building();
		Building building2 = new Building();

		Runnable room1Task = () -> {
			try {
				building1.room1();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Runnable room2Task = () -> {
			try {
				building2.room2();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Thread fooThread = new Thread(room1Task, "foo");
		Thread barThread = new Thread(room1Task, "bar");
		Thread bazThread = new Thread(room2Task, "baz");

		fooThread.start();
		barThread.start();
		bazThread.start();
	}

}
