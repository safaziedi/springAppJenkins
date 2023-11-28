package com.example.dem2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Dem2Application {

	@GetMapping
	String getMessage(){
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Dem2Application.class, args);
	}

}
