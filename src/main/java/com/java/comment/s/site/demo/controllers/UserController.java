package com.java.comment.s.site.demo.controllers;
import com.java.comment.s.site.demo.dao.UsuarioDao;
import com.java.comment.s.site.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping({"/current_user/{id}"})
    public User getUniqueUser(@PathVariable("id") Long id) {
        return new User(id, "alexei", "alexei.saron@gmail.com", "asdfasf");
    }

    @RequestMapping(value = "list_users")
    public List<User> getListUsers() {
        return usuarioDao.getUsuarios();
      // return List.of(
      //         new User(1L, "alexei", "alexei.saron@gmail.com", "asdfasd1"),
      //         new User(2L, "pete", "pete@gmail.com", "asdfa"),
      //         new User(3L, "tatiana", "tatiana@gmail.com", "password")
      // );
    }

}
