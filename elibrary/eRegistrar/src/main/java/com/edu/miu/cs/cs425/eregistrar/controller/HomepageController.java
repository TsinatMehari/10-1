package com.edu.miu.cs.cs425.eregistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController {
    @GetMapping(value = {"/","/eRegistrar","/eRegistrar/Home"})
    public String displayHomepage(){
        return "Home/inde";
    }
}
