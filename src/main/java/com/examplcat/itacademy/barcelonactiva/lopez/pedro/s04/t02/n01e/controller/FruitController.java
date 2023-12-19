package com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.controller;

import java.rmi.ServerException;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PostMapping(path = "/add")
	public ResponseEntity<Fruit> createFruit (@RequestBody Fruit fruit ) throws ServerException {
		Fruit newFruit = fruitService.createFruit(fruit);		
		if (newFruit == null) {
			throw new ServerException("There is server exception error, please try again later.");
		} else {
			return new ResponseEntity<>(newFruit, HttpStatus.CREATED);

		}
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Fruit> updateFruit (@PathVariable int id, @RequestBody Fruit fruit) {
		Fruit thisFruit = fruitService.getOneFruitById(id);
		thisFruit.setName(fruit.getName());
		thisFruit.setKilos(fruit.getKilos());
		
		Fruit updatedFruit = fruitService.createFruit(thisFruit);
		
		return new ResponseEntity<>(updatedFruit, HttpStatus.CREATED);
		
	}
	
	@DeleteMapping ("/delete/{id}")
	public ResponseEntity<HashMap<String, Boolean>> deleteFruit (@PathVariable int id) {
		fruitService.deleteFruit(id);
		
		HashMap<String, Boolean> fruitDeletedState =  new HashMap<String, Boolean>();
		fruitDeletedState.put("Deleted", true);
		
		return ResponseEntity.ok(fruitDeletedState);
	
	}
	
	@GetMapping ("/getOne/{id}")
	public ResponseEntity<Fruit> getOneFruitByID (@PathVariable int id) {
		Fruit thisFruit = fruitService.getOneFruitById(id);
		return ResponseEntity.ok(thisFruit);
	}
	
	@GetMapping ("/getAll")
	public ResponseEntity<List<Fruit>> getAllFruits () {
		return ResponseEntity.ok(fruitService.getAllFruits());
	}
	
}
