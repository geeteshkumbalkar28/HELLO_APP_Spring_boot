package com.bridgelabz.HelloApp.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class HelloController {
    @RequestMapping(value="/hello" , method = RequestMethod.GET)
    public String message(){
        return "Hello from BridgeLabz";
    }
    @RequestMapping(value="/hello/query",method = RequestMethod.GET)
    public String message1(@RequestParam String name){
        return name;
    }

    @RequestMapping(value="/hello/param/{name}",method = RequestMethod.GET)
    public String message2(@PathVariable String name){
         return name;
    }

}