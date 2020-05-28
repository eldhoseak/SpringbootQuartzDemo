package com.quartz.sample;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomGeneratorController {
	Random random = new Random(); 
	
	@RequestMapping(value = "/randomNumber", method = RequestMethod.GET)
	public int randomrGenerator() {
		return Math.abs(random.nextInt());
	}
}
