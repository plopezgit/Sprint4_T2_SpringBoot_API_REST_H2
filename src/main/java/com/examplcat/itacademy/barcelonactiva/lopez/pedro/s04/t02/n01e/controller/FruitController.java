package com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.controller;

import java.rmi.ServerException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.domain.Fruit;
import com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.service.FruitService;

@RestController
@RequestMapping("fruits")
public class FruitController {
	
	@Autowired
	private FruitService fruitService;
	
	@PostMapping(path = "add",         
			consumes = MediaType.APPLICATION_JSON_VALUE, 
	        produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Fruit> createFruit (@RequestBody Fruit fruit ) throws ServerException {
		Fruit newFruit = fruitService.createFruit(fruit);		
		if (newFruit == null) {
			throw new ServerException("There is server exception error, please try again later.");
		} else {
			return new ResponseEntity<>(newFruit, HttpStatus.CREATED);

		}
		
	}
}
