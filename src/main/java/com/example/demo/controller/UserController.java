package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by framgia on 28/02/2018.
 */

@RestController
//@PropertySource("file:application.properties")

public class UserController {

    private UserRepository userRepository;

    @Value("${VARNAME}")
    private String passowrd;

    @Autowired
    private Environment env;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> findALlUsers() {
        System.out.println(passowrd);
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public void addUser(@RequestBody AddUserRequest addUserRequest) {
        User user = new User();
        user.setName(addUserRequest.getName());
        user.setSurname(addUserRequest.getSurname());
        userRepository.save(user);
    }
}
