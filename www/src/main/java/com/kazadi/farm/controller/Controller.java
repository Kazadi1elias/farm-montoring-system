package com.kazadi.farm.controller;


import com.kazadi.farm.service.UserService;
import com.kazadi.farm.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    UserService userService;

    @GetMapping(path = "/")
    public String index(){

        return "index";
    }

    @PostMapping(path = "/saveUsers")
    public ResponseEntity<String> saveUsers(@RequestBody Users users, Model model){

        System.out.println(users.toString());
        System.out.println(users.getId());
        System.out.println(users.getfName());
        System.out.println(users.getlName());
        System.out.println(users.getEmail());
        System.out.println(users.getPhone());
        System.out.println(users.getUser_role());
        System.out.println(users.getPassword());
        model.addAttribute("id", users.getId());
        model.addAttribute("fName", users.getfName());
        model.addAttribute("lName", users.getlName());
        model.addAttribute("email", users.getEmail());
        model.addAttribute("phone", users.getPhone());
        model.addAttribute("user_role", users.getUser_role());
        model.addAttribute("password", users.getPassword());



    return new ResponseEntity<>("User Saved", HttpStatus.OK);}

    @CrossOrigin
    @GetMapping(path = "/getUsers")
    public ResponseEntity<List<Users>> getUsers(){

        return  new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
    }

}
