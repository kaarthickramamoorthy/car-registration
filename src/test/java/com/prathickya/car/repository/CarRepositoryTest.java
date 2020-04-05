package com.prathickya.car.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import com.prathickya.car.models.Car;

@SpringBootTest
class CarRepositoryTest {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CarRepository carRepo;
	
	@Test
	void findAllCars() {
		List<Car> allCars = carRepo.findAllCars();
		logger.info("All cars");
		allCars.stream().forEach(car -> logger.info("car {} " + car));
	}

	@Test
	void findCarBySno() {
		logger.info("Inside findCarBySno");
		Car findById = carRepo.findCarBySno("123abc");
		assertEquals("Tucson", findById.getModel());
	}
	
	@Test
	@DirtiesContext  //Spring would reset the data back to the original state after completing this test
	void deleteCarBySno() {
		logger.info("Inside deleteCarBySno");
		Boolean deleteCarBySno = carRepo.deleteCarBySno("123abc");
		assertEquals(true, deleteCarBySno);
	}
	
	
	@Test
	void insertCar() {
		logger.info("Inside insertCar");
		Car carToBeInserted = new Car("Abhaya","sweetabhi28@gmail.com","123-654-9876","BMW","xyz245g",new BigDecimal(50000),Date.valueOf("2018-08-30"),false);
		carRepo.insertCar(carToBeInserted);
		
		//Check it was inserted fine
		Car carFromDB = carRepo.findCarBySno(carToBeInserted.getSno());
		assertEquals(carToBeInserted.getSno(), carFromDB.getSno());
	}
	
	@Test
	void updateCar() {
		logger.info("Inside updateCar");
		Car kaarthickCar = carRepo.findCarBySno("123abc");
		kaarthickCar.setContact(false);
		
		//Check it was inserted fine
		Car carFromDB = carRepo.updateCar(kaarthickCar);
		assertEquals(kaarthickCar.getContact(), carFromDB.getContact());
	}

}
