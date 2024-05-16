package com.nahian.beandemo;

import java.util.HashMap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@SpringBootApplication
public class BeanDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanDemoApplication.class, args);
	}

	@GetMapping("/")
	public HashMap<String, String> index() {

		HashMap<String, String> response = new HashMap<>();

		response.put("msg", "Welcome to bean demo api");
		response.put("status", "success");

		return response;
	}

}
