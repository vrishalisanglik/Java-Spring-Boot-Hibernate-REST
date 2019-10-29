package org.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.springboot")
public class SpringbootDemo {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemo.class, args);
	}

}
