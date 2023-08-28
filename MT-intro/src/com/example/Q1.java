package com.example;

// Singleton class
class Boss {
	private static Boss boss;

	private Boss() {
	}

	public static Boss getInstance() {
		if (boss == null) {
			boss = new Boss();
		}
		return boss;
	}
}

public class Q1 {

	public static void main(String[] args) {
		Boss boss1 = Boss.getInstance();
		Boss boss2 = Boss.getInstance();
		System.out.println(boss1 == boss2);

	}

}
