package com.cesar.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.cesar.springboot.webapp.springboot_web.models.User;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {

        User user = new User("cesar", "roa", "");
        user.setEmail("cesae@gmail.com");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("User", user);

        return "details";

    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = Arrays.asList(new User("cesar", "lolo", "@gamil"),
                new User("pepe", "lolo", "@gamil"),
                new User("carlos", "lolo", "@gamil"));
        model.addAttribute("users", users);
        model.addAttribute("title", "lista de usuarios");
        return "list";
    }

}
