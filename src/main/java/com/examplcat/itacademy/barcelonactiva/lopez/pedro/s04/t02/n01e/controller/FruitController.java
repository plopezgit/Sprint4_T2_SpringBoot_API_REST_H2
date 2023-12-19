package com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.service.FruitService;

@RestController
@RequestMapping("fruits")
public class FruitController {
	
	@Autowired
	FruitService fruitService;
	
}
