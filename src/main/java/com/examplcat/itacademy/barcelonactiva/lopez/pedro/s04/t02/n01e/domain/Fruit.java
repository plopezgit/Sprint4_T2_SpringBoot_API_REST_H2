package com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "frutas")
public class Fruit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int kilos;
	
	public Fruit() {
		
	}

	public Fruit(String name, int kilos) {
		this.name = name;
		this.kilos = kilos;
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
		return kilos;
	}

	public void setKilos(int kilos) {
		this.kilos = kilos;
	}

	@Override
	public String toString() {
		return "Fruit [id=" + id + ", name=" + name + ", kilos=" + kilos + "]";
	}

}
