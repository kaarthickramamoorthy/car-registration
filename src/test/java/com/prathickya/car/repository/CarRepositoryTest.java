package com.prathickya.car.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
