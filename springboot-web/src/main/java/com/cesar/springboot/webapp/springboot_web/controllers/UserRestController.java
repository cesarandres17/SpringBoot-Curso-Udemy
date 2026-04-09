package com.cesar.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cesar.springboot.webapp.springboot_web.models.User;
import com.cesar.springboot.webapp.springboot_web.models.dto.UserDto;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path = "/details2")
    public UserDto details() {
        User user = new User("cesar", "roa");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("HOLA MUNDO");
        return userDto;

    }

    @GetMapping("/list")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

    public List<User> list() {
        User user1 = new User("cesar", "roa");
        User user2 = new User("carlos", "roa");
        User user3 = new User("fernando", "roa");
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return users;

    }

    @GetMapping(path = "/details-map")
    public Map<String, Object> detailsMap() {

        User user = new User("cesar", "roa");
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("title", "Hola Mundo Spring Boot");
        body.put("User", user);
        return body;

    }

}
