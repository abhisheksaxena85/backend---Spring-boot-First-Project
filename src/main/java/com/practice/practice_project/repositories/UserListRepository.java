package com.practice.practice_project.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.practice.practice_project.Entity.UserProfileEntity;

public interface UserListRepository extends MongoRepository<UserProfileEntity, String> {

}
