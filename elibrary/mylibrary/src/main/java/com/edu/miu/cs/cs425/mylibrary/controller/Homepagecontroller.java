package com.edu.miu.cs.cs425.mylibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homepagecontroller {
    @GetMapping (value = {"/","/mylibrary","/mylibrary/home"})
    public String displayHomepage(){
        return "home/index";
    }
}
