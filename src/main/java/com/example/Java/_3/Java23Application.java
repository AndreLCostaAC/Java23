package com.example.Java._3;

import com.example.Java._3.Person.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;


@SpringBootApplication
public class Java23Application {

	public static void main(String[] args) {
		SpringApplication.run(Java23Application.class, args);
	}

}