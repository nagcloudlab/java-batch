package com.example;

class Counter {
	private long count = 0;
	public synchronized void increment() {
		count++;// read -> increment --> write
	}
	public long getCount() {
		return count;
	}
}
class CounterTask implements Runnable {
	private Counter counter;
	public CounterTask(Counter counter) {
		this.counter = counter;
	}
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			counter.increment();
		}
	}
}

public class Ex5 {

	public static void main(String[] args) throws InterruptedException {

		
		Counter counter = new Counter();
		CounterTask counterTask = new CounterTask(counter);

		Thread[] threads = new Thread[1000];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(counterTask);
			threads[i].start();
		}

		for (int i = 0; i < threads.length; i++) {
			threads[i].join();
		}

		System.out.println(counter.getCount()); // 1000 * 1000 => 1000000

	}

}
