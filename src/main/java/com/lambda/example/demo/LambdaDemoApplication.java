package com.lambda.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class LambdaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaDemoApplication.class, args);
	}

	@Bean
	public Function<Employee, Employee> testFunction(){
		return testJson -> {
			return testJson;
		};
	}


}
