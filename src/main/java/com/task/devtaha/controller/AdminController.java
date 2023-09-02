package com.task.devtaha.controller;

import com.task.devtaha.Service.UserService;
import com.task.devtaha.model.User_Location;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/admin")
public class AdminController {

    private final UserService userService;

    @PostMapping("/add")
    public ResponseEntity<User_Location> addUser(
            @RequestBody User_Location user){
        User_Location user_u = userService.addUser(user);
        return ResponseEntity.ok(user_u);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Integer id){
        return userService.deleteUser(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<User_Location> updateUser(
            @PathVariable Integer id,
            @RequestBody User_Location user
    ) {
        User_Location updated_user =  userService.updateUser(id,user);
        return ResponseEntity.ok(updated_user);
    }

    @GetMapping("/username/{name}")
    public ResponseEntity<User_Location> getUserByName(@PathVariable String name) {
        User_Location user_name = userService.getUserByName(name);
        return ResponseEntity.ok(user_name);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User_Location> getUserById(
            @PathVariable Integer id
    ){
        User_Location user_id = userService.getUserById(id);
        return ResponseEntity
                .accepted()
                .body(user_id);
    }
    @GetMapping("/user_id/{name}")
    public Integer getIdByName(
            @PathVariable String name
    ){
        return userService.getIdByName(name);
    }

}