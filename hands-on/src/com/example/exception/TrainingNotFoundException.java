package com.example.exception;

public class TrainingNotFoundException extends RuntimeException {

	public TrainingNotFoundException(int id) {
		super(String.valueOf(id));
	}

}
