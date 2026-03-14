package com.bipanshu.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
     
     @GetMapping("/")
     public String defaultHome(){
         return "home";
     }

     @GetMapping("/home")
     public String home(){
        System.out.println("Home page handler");
        return "home";
     }

     @GetMapping("/about")
     public String about(){
        return "about";
     }

     @GetMapping("/services")
     public String services(){
        return "services";
     }

     @GetMapping("/dashboard")
     public String dashboard(){
        return "dashboard";
     }

     
}
