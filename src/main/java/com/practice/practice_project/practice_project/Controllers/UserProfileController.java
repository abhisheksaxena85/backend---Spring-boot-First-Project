package com.practice.practice_project.practice_project.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.practice_project.practice_project.Entity.UserProfileEntity;

@RestController
@RequestMapping("user")
public class UserProfileController {

    public List<UserProfileEntity> dataList = new ArrayList<>();

    @GetMapping("/get-profile-data")
    public List<UserProfileEntity> getUserData() {
        return dataList;
    }

    @PostMapping("/create-profile")
    public boolean createProfile(@RequestBody UserProfileEntity body) {
        dataList.add(body);
        return true;
    }

    @GetMapping("/get-username")
    public String userName(@RequestParam int id) {
        return dataList.get(id - 1).getName();
    }

    @GetMapping("/get-profile/{id}")

    public UserProfileEntity profileData(@PathVariable int id) {
        return dataList.get(id - 1);
    }
}
