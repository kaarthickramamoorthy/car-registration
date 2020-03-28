package com.prathickya.car;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prathickya.car.models.Car;
import com.prathickya.car.repository.CarRepository;

@SpringBootApplication
public class CarApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CarRepository rep;

	public static void main(String[] args) {
		SpringApplication.run(CarApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Car car = rep.findById(1);
		logger.info("Car with id 1 -->  {} ", car);
	}

}
