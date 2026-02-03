package com.practice.practice_project.practice_project.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.practice_project.practice_project.Entity.UserProfileEntity;
import com.practice.practice_project.practice_project.Services.UserListService;

@RestController
@RequestMapping("user")
public class UserProfileController {

    @Autowired
    UserListService userListService;

    @GetMapping("/get-all-users")
    public List<UserProfileEntity> getUserData() {
        return userListService.getAllUsers();
    }

    @GetMapping("/get-user-by-id")
    public UserProfileEntity getUserById(@RequestParam String id) {
        return userListService.getUserById(id);
    }

    @PostMapping("/create-user")
    public boolean createUser(@RequestBody UserProfileEntity body) {
        userListService.saveUser(body);
        return true;
    }

    @PutMapping("/update-user-by-id")
    public boolean updateUser(@RequestBody UserProfileEntity body) {
        userListService.updateUser(body);
        return true;
    }

    @DeleteMapping("/delete-user-by-id/{id}")
    public void deleteUserById(@PathVariable String id) {
        userListService.deleteUser(id);
    }

    @DeleteMapping("/delete-all-users")
    public void deleteAllUsers() {
        userListService.deleteAll();
    }
}
