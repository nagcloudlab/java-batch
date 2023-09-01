package com.example.exception;

public class EmployeeExistException extends RuntimeException {

	public EmployeeExistException(int id) {
		super(String.valueOf(id));
	}

}
