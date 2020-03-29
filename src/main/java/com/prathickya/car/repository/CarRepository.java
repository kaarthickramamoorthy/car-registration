package com.prathickya.car.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prathickya.car.models.Car;

@Repository
public class CarRepository {
	
	@Autowired
	EntityManager em;
	
	public Car findCarBySno(String sno) {
		return em.find(Car.class, sno);
	}
	
	@Transactional
	public Boolean deleteCarBySno(String sno) {
		boolean isCarFound = Boolean.FALSE;
		
		Car car = em.find(Car.class, sno);
		if(car != null) {
			em.remove(car);
			isCarFound = Boolean.TRUE;
		}
		return isCarFound;
	}

}
