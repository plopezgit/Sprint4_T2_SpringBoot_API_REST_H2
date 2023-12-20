package com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.service;

import java.util.List;

import com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.domain.Fruit;
import com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.exception.FruitEmptyException;
import com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.exception.FruitNoFoundException;

public interface FruitServiceInterface {
	
	public Fruit createFruit (Fruit fruit) throws FruitEmptyException;
	public void deleteFruit (int id) throws FruitNoFoundException;
	public Fruit getOneFruitById (int id) throws FruitNoFoundException;
	public List<Fruit> getAllFruits ();
}
