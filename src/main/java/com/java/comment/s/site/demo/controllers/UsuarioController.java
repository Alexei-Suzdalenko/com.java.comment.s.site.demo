package com.java.comment.s.site.demo.controllers;
import com.java.comment.s.site.demo.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "test")
    public List<String> test(){
        return List.of( "test", "second", "jui");
    }

    @RequestMapping(value = "user/{id}")
    public User getUser(@PathVariable Long id){
        User user = new User();
        user.setId(id);
        user.setName("alexei");
        user.setEmail("email@gmail.com");
        user.setPassword("password");
        return user;
    }

    @RequestMapping(value = "edit")
    public User editUser(){
        User user = new User();
        user.setName("alexei");
        user.setEmail("email@gmail.com");
        user.setPassword("password");
        return user;
    }

    @RequestMapping(value = "search")
    public User searchUser(){
        User user = new User();
        user.setName("alexei");
        user.setEmail("email@gmail.com");
        user.setPassword("password");
        return user;
    }

    @RequestMapping(value = "delete")
    public User deleteUser(){
        User user = new User();
        user.setName("alexei");
        user.setEmail("email@gmail.com");
        user.setPassword("password");
        return user;
    }
}
