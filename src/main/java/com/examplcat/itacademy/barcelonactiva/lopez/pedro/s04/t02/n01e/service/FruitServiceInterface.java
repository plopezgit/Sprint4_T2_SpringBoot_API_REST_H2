package com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.service;

import java.util.List;

import com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.domain.Fruit;

public interface FruitServiceInterface {
	
	public Fruit createFruit (Fruit fruit);
	public void deleteFruit (int id);
	public Fruit getOneFruitById (int id);
	public List<Fruit> getAllFruits ();
}
