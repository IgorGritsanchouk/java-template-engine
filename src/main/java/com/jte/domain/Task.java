package com.jte.domain;

import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter
public class Task{
    private final String id;
    private final String description;

    public Task(String description){
        this.id= UUID.randomUUID().toString();
        this.description= description;
    }
}
