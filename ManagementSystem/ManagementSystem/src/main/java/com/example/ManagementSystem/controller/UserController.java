package com.example.ManagementSystem.controller;

import com.example.ManagementSystem.model.User;
import com.example.ManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/management")
public class UserController {
    @Autowired
    public UserService userService;

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
       return userService.getAllUser();
    }
    @GetMapping("/userId/{userId}")
    public User getUser(@PathVariable int userId){
        return userService.getById(userId);
    }
    @PostMapping("/addUser")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
    @PutMapping("/updateUser/{userId}")
    public void updateUserInfo(@PathVariable int userId,@RequestBody User user){
        userService.updateUserInfo(userId,user);
    }
    @DeleteMapping("/deleteUser/{userId}")
    public void deleteUser(@PathVariable int userId){
        userService.deleteUser(userId);
    }
}
