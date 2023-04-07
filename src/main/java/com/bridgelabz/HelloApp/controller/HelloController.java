package com.bridgelabz.HelloApp.controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping(value="/body",method = RequestMethod.POST)
    public String acceptData(@RequestBody User user){
        return user.toString();
    }

}