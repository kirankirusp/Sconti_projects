package com.example.Scontidemo.service;

import com.example.Scontidemo.model.User;
import com.example.Scontidemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    UserRepository userRepository;
    public Collection<User> getAll(){
        return userRepository.getAllUsers();
    }
}
