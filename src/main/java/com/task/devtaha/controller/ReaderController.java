package com.task.devtaha.controller;

import com.task.devtaha.Service.UserService;
import com.task.devtaha.model.User_Location;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/reader")
@RequiredArgsConstructor
public class ReaderController {
    private final UserService userService;

    @GetMapping("/users")
    public List<User_Location> getUsers(){
        return userService.getUser();
    }
}
