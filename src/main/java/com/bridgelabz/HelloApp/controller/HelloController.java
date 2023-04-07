package com.bridgelabz.HelloApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class HelloController {
    @RequestMapping(value="/hello" , method = RequestMethod.GET)
    public String message(){
        return "Hello from BridgeLabz";
    }

}