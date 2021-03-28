package com.javaglobalsummit.junit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @GetMapping("/hello-globalsummit")
  public String helloWorld() {
    return "Hello globalsummi for java devs 2021";
  }


}
