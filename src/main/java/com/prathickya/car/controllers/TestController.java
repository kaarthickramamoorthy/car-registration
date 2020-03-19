package com.prathickya.car.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("test")
	public String getTestMessage() {
		return "<H1 style=\"color:blue\"> Test message </H1>";
	}
	
}
