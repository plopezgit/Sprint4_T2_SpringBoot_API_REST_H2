package com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class FruitExceptionHandler {
	
	

    @ExceptionHandler(value = {FruitNoFoundException.class})
    public ResponseEntity<Object> handleFruitNotFoundException
            (FruitNoFoundException fruitNotFoundException)
    {
        FruitException fruitException = new FruitException(
        		fruitNotFoundException.getMessage(),
        		fruitNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(fruitException, HttpStatus.NOT_FOUND);
    }
    
    @ExceptionHandler(value = {FruitEmptyException.class})
    public ResponseEntity<Object> handleFruitEmptyException
            (FruitEmptyException fruitEmptyException)
    {
        FruitException fruitException = new FruitException(
        		fruitEmptyException.getMessage(),
        		fruitEmptyException.getCause(),
                HttpStatus.BAD_REQUEST
        );

        return new ResponseEntity<>(fruitException, HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(value = {FruitsIsEmptyException.class})
    public ResponseEntity<Object> handleFruitsIsEmptyException
            (FruitsIsEmptyException fruitsIsEmptyException)
    {
        FruitException fruitException = new FruitException(
        		fruitsIsEmptyException.getMessage(),
        		fruitsIsEmptyException.getCause(),
                HttpStatus.NO_CONTENT
        );

        return new ResponseEntity<>(fruitException, HttpStatus.NO_CONTENT);
    }

}
