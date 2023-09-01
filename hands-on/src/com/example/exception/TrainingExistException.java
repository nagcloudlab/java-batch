package com.example.exception;

public class TrainingExistException extends RuntimeException {
	
	public TrainingExistException(int id) {
		super(String.valueOf(id));
	}

}
