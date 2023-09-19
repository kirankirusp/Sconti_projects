package com.example.Scontidemo.resource;

import com.example.Scontidemo.model.User;
import com.example.Scontidemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/")
public class UserResource {
    @Autowired
    UserService userService;

    @GetMapping
    public Collection<User> getAll(){
        return userService.getAll();
    }
}
