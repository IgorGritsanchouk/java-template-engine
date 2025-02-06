package com.jte.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrentPage {

    private String name;
    private String title;
    private String description;
    private String templateName;
    private String locale;
    private User user;
    private String error;
    private String message;
    public CurrentPage(String name, String title, String description, String templateName, String locale){
        this.name= name;
        this.title= title;
        this.description= description;
        this.templateName= templateName;
        this.locale= locale;
    }

    public boolean isSelected(String locale){
        return (this.locale == locale ? true : false);
    }

}
