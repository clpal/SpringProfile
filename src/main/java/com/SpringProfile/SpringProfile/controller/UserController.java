package com.SpringProfile.SpringProfile.controller;

import com.SpringProfile.SpringProfile.model.User;
import com.SpringProfile.SpringProfile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.PanelUI;
import java.security.PublicKey;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/findAllUsers")
    public List<User> findAllUsers(){
        return userService.getUsers();

    }
}
