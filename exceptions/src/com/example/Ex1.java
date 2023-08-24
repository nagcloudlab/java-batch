package com.example;

public class Ex1 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (IllegalStateException e) {
			System.out.println("main handling ex " + e.getMessage());
		}
	}

	private static void method1() {
		method2();
	}

	private static void method2() {
		try {
			method3();
		} catch (IllegalStateException e) {
			System.out.println("method-2 handling ex " + e.getMessage());
			throw e;
		}
	}

	private static void method3() {
		throw new IllegalStateException("Not well");
	}

}
