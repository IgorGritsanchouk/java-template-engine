package com.jte.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IgPage {

    private String name;
    private String title;
    private String description;
    public IgPage(String name, String title, String description){
        this.name= name;
        this.title= title;
        this.description= description;
    }
}
