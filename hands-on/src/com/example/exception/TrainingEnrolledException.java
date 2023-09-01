package com.example.exception;

public class TrainingEnrolledException extends RuntimeException {

	public TrainingEnrolledException(int id) {
		super(String.valueOf(id));
	}

}
