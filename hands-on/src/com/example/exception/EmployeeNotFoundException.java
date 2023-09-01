package com.example.exception;

public class EmployeeNotFoundException extends RuntimeException {

	public EmployeeNotFoundException(int id) {
		super(String.valueOf(id));
	}

}
