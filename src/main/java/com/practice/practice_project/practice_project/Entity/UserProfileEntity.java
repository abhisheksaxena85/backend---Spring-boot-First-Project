package com.practice.practice_project.practice_project.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "users_list_collections")
@Data
public class UserProfileEntity {

    @Id
    private String id;

    private String name;
}
