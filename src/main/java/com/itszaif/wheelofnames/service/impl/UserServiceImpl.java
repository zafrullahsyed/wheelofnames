package com.itszaif.wheelofnames.service.impl;

import com.itszaif.wheelofnames.entity.User;
import com.itszaif.wheelofnames.repository.UserRepository;
import com.itszaif.wheelofnames.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getAllUsers() {
        userRepository.findAll();
        return null;
    }

    @Override
    public void saveNewUser() {

    }

    @Override
    public void deleteUser() {

    }

    @Override
    public void updateUser() {

    }
}
