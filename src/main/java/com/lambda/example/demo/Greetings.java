package com.lambda.example.demo;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class Greetings implements Function<String, String> {

    @Override
    public String apply(String s) {
        return "Hello, I am spring cloud function";
    }
}
