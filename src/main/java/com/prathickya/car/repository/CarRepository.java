package com.prathickya.car.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prathickya.car.models.Car;

@Repository
public class CarRepository {
	
	@Autowired
	EntityManager em;
	
	public Car findById(long id) {
		return em.find(Car.class, id);
	}

}
