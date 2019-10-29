package com.springboot.rest.a.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrintMessageController {

	@GetMapping("/print")
	public String printMessage() {
		return "First Message !!";
	}
	
	@GetMapping("/print/var/{data}")
	public String printMessageVariable(@PathVariable String data) {
		return data;
	}
	
	@GetMapping("/printbean")
	public MyBean printMessageBean() {
		return new MyBean("First Message from Bean !!");
	}

	@GetMapping("/printbean/var/{data}")
	public MyBean printMessageBean(@PathVariable String data) {
		return new MyBean(data);
	}
	
}
