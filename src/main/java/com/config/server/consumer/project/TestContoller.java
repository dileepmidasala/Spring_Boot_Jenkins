package com.config.server.consumer.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContoller {
	@GetMapping("/gerService")
	public String getService() {
		return "This is Testing";
	}

}
