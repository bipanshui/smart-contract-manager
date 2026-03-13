package com.bipanshu.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
     
     @GetMapping("/home")
     public String home(){
        System.out.println("Home page handler");
        return "home";
     }
}
