package com.bankapp.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(){
        return "dashboard";
    }
    @GetMapping("/test")
    public String test(){
        return "testPage";
    }
}
