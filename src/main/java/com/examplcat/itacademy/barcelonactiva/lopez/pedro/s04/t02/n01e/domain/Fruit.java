package com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "frutas")
public class Fruit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int kilograms;
	
	public Fruit() {
		
	}

	public Fruit(String name, int kilos) {
		this.name = name;
		this.kilograms = kilos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKilos() {
		return kilograms;
	}

	public void setKilos(int kilos) {
		this.kilograms = kilos;
	}

	@Override
	public String toString() {
		return "Fruit [id=" + id + ", name=" + name + ", kilos=" + kilograms + "]";
	}

}
