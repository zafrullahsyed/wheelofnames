package com.itszaif.wheelofnames.controller;

import com.itszaif.wheelofnames.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/allUsers")
    public void getListOfUsers(){
        userService.getAllUsers();
    }

    @PostMapping("/saveNewUser")
    public void saveNewUser(){
        // TODO: user exists
        userService.saveNewUser();
    }

    @DeleteMapping("/deleteUser")
    public void deleteUser(){
        // TODO: user exists
        userService.deleteUser();
    }

    @PutMapping("/updateUser")
    public void updateUser(){
        // TODO: user exists

        userService.updateUser();
    }
}
