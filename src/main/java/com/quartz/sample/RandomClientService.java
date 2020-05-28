package com.quartz.sample;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "randomNumberClient" , url="localhost:8080")
public interface RandomClientService {

	@RequestMapping(value = "/randomNumber", method = RequestMethod.GET)
	int getRandomNumber();
}
