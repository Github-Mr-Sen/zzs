package com.love.springboot_jpa.controller;

import com.love.springboot_jpa.bean.UserBean;
import com.love.springboot_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository repository;
    @GetMapping("/user/{id}")
    public UserBean getuser(
            @PathVariable("id") Integer id) {

        UserBean one = repository.findOne(id);
        return one;
    }

    @GetMapping("/user")
    public UserBean adduser(UserBean user) {
        UserBean save = repository.save(user);
        return save;
    }
}
