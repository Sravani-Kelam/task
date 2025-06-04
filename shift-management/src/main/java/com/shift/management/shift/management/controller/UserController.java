package com.shift.management.shift.management.controller;

import com.shift.management.shift.management.dto.UserDto;
import com.shift.management.shift.management.service.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserImpl userImpl;

    @PostMapping("/saveuser")
    public ResponseEntity<UserDto>saveUser(@RequestBody UserDto userDto){
        UserDto savedUser=userImpl.saveUser(userDto);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
}
