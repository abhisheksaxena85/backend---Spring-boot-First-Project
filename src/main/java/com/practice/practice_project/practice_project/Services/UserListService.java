package com.practice.practice_project.practice_project.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice.practice_project.practice_project.Entity.UserProfileEntity;
import com.practice.practice_project.practice_project.repositories.UserListRepository;

@Component
public class UserListService {

    @Autowired
    UserListRepository userListRepository;

    public void saveUser(UserProfileEntity userProfile) {
        userListRepository.save(userProfile);
    }

    public void deleteUser(String id) {
        userListRepository.deleteById(id);
    }

    public void deleteAll() {
        userListRepository.deleteAll();
    }

    public List<UserProfileEntity> getAllUsers() {
        return userListRepository.findAll();
    }

    public UserProfileEntity getUserById(String id) {
        return userListRepository.findById(id).orElse(null);
    }

    public void updateUser(UserProfileEntity updatedEntity) {
        userListRepository.save(updatedEntity);
    }
}
