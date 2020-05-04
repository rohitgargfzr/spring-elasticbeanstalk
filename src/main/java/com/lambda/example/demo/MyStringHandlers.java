package com.lambda.example.demo;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;
import org.springframework.stereotype.Service;

public class MyStringHandlers extends SpringBootRequestHandler<String, String> {
  public  MyStringHandlers(){

    }
}
