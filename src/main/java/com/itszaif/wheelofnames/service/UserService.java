package com.itszaif.wheelofnames.service;

import com.itszaif.wheelofnames.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User getAllUsers();

    void saveNewUser();

    void deleteUser();

    void updateUser();
}
