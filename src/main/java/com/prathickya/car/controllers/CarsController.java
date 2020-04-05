package com.prathickya.car.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.prathickya.car.models.Car;
import com.prathickya.car.repository.CarRepository;

//This is Spring MVC Controller. It needs few annotation so that Spring will process it correctly
//@RequestMapping - Inform Spring that this is the base mapping(path or url the application will respond to when request is made)

@RestController
@RequestMapping("/api/v1/cars")
public class CarsController {
	
	Logger logger = LoggerFactory.getLogger(CarsController.class);
	
	@Autowired
	CarRepository carRepo;

	// When a request is made with HTTP GET, with base mapping /api/v1/cars -> This
	// method will be invoked
	@GetMapping
	public List<Car> list() {
		return carRepo.findAllCars();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Car car) {
		carRepo.insertCar(car);
	}

	@GetMapping("/{sno}")
	public Car get(@PathVariable("sno") String sno) {
		return carRepo.findCarBySno(sno);
	}

}
