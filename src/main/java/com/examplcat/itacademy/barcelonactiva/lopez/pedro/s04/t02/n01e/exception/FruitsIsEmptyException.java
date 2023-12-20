package com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.exception;

public class FruitsIsEmptyException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public FruitsIsEmptyException(String message) {
		super(message);
	}

	public FruitsIsEmptyException(String message, Throwable cause) {
		super(message, cause);
	}
	
	
	
}
