package com.bridgelabz.HelloApp.controller;
import com.bridgelabz.HelloApp.model.User;
import com.bridgelabz.HelloApp.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class HelloController {
    @Autowired
    private IUserRepo iUserRepo;

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
    public User acceptData(@RequestBody User user){
         User userData = new User(user.getFirstName(), user.getLastName(), user.getMobileNumber(), user.getAddress());
        return iUserRepo.save(userData);
    }
    @PutMapping("/update/{id}")
    public User updateData(@RequestBody User user ,@PathVariable int id){
        Optional<User> userData = iUserRepo.findById(id);
        if(userData.isPresent())
        {
            userData.get().setFirstName(user.getFirstName());
            userData.get().setLastName(user.getLastName());
            userData.get().setMobileNumber(user.getMobileNumber());
            userData.get().setAddress(user.getAddress());

            return iUserRepo.save(userData.get());
        }
        return null;
    }


}