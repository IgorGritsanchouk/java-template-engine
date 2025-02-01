package com.jte.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IgPage {

    private String name;
    private String title;
    private String description;
    private String locale;
    public IgPage(String name, String title, String description, String locale){
        this.name= name;
        this.title= title;
        this.description= description;
        this.locale= locale;
    }

    public String getOptionSelected(String locale){
        return (this.locale == locale ? "selected" : "");
    }

}
