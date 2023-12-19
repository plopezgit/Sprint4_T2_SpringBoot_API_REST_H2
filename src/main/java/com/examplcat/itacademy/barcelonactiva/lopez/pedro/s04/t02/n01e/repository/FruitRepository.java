package com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examplcat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n01e.domain.Fruit;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Integer> {

}
