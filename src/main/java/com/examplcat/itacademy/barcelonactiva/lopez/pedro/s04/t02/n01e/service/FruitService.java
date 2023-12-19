package com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.domain.Fruit;
import com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.repository.FruitRepository;

public class FruitService {
	
	@Autowired
	private FruitRepository fruits;
	
	public Fruit createFruit (Fruit fruit) {
		return fruits.save(fruit);
		
	} 
	
	public void deleteFruit (int id) {
		fruits.deleteById(id);
	}
	
	public Fruit getOneFruitById (int id) {
		Optional<Fruit> optionalFruit = fruits.findById(id);
		return optionalFruit.get();
		
	}
	
	public List<Fruit> getAllFruits () {
		return fruits.findAll();
	}
}
