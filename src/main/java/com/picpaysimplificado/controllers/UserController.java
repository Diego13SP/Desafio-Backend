package com.picpaysimplificado.controllers;


import com.picpaysimplificado.domain.user.UserModel;
import com.picpaysimplificado.dto.UserDTO;
import com.picpaysimplificado.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/users")
@CrossOrigin(origins = "*")

public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserModel> createUser(@RequestBody UserDTO user){
        UserModel userModel = userService.createUser(user);
        return new ResponseEntity<>(userModel, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<UserModel>> getAllUsers(){
       List<UserModel> userModels = this.userService.getAllUsers();
        System.out.println("ok");
       return new ResponseEntity<>(userModels,HttpStatus.OK);

    }




}