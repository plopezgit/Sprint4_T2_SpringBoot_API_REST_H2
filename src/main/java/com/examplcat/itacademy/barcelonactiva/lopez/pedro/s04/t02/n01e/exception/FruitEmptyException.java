package com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.exception;

public class FruitEmptyException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public FruitEmptyException(String message) {
		super(message);
	}

	public FruitEmptyException(String message, Throwable cause) {
		super(message, cause);
	}
	
	
	
}
