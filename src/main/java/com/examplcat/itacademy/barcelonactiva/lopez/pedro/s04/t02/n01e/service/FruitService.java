package com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.domain.Fruit;
import com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.exception.FruitNoFoundException;
import com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.repository.FruitRepository;

@Service
public class FruitService implements FruitServiceInterface {
	
	@Autowired
	private FruitRepository fruits;
	
	@Override
	public Fruit createFruit (Fruit fruit) {
		return fruits.save(fruit);
		
	} 
	
	@Override
	public void deleteFruit (int id) {
		fruits.deleteById(id);
	}
	
	@Override
	public Fruit getOneFruitById (int id) {
		Optional<Fruit> optionalFruit = fruits.findById(id);
		if (optionalFruit.isEmpty()) {
			throw new FruitNoFoundException("Fruit id does not exist on teh database.");
		}
		return optionalFruit.get();
		
	}
	
	@Override
	public List<Fruit> getAllFruits () {
		return fruits.findAll();
	}
}
