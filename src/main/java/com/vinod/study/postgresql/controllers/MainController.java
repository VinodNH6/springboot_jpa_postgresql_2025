package com.vinod.study.postgresql.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {

 @RequestMapping("/main")
 public String helloGFG()
 {
     return "Hello from main controller";
 }
}