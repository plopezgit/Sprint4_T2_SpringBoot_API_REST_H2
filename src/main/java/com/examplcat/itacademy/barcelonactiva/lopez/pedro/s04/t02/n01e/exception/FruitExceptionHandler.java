package com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class FruitExceptionHandler {
	
	

    @ExceptionHandler(value = {FruitNoFoundException.class})
    public ResponseEntity<Object> handleCloudVendorNotFoundException
            (FruitNoFoundException fruitNotFoundException)
    {
        FruitException fruitException = new FruitException(
        		fruitNotFoundException.getMessage(),
        		fruitNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(fruitException, HttpStatus.NOT_FOUND);
    }

}
