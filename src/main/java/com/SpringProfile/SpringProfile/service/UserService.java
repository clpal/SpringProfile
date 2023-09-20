package com.SpringProfile.SpringProfile.service;

import com.SpringProfile.SpringProfile.dao.UserRepository;
import com.SpringProfile.SpringProfile.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Profile(value = {"local","dev","prod"})
    public List<User> getUsers(){
       return userRepository.findAll();

    }
}
