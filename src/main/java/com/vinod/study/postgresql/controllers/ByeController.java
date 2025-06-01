package com.vinod.study.postgresql.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByeController {

 @RequestMapping("/bye")
 public String helloGFG()
 {
     return "Hello from Bye controller";
 }
}