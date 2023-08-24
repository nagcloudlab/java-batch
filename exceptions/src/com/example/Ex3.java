package com.example;

import java.io.Closeable;

class DatabaseConnection implements Closeable {
	public void init() {
		System.out.println("Init()");
	}

	public void use() {
		System.out.println("Use()");
		if (true) {
			throw new IllegalStateException("network down");
		}
	}

	public void close() {
		System.out.println("Close()");
	}
}

public class Ex3 {

	public static void main(String[] args) {

		
		try(DatabaseConnection connection= new DatabaseConnection()) {
			connection.init();
			connection.use();
		} catch (Exception e) {
			System.out.println("Ex-" + e.getMessage());
		}
		

	}

}
