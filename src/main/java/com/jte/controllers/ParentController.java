package com.jte.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.context.MessageSource;

import java.util.Locale;

public class ParentController {

    protected final MessageSource messageSource;

    public ParentController(MessageSource messageSource){
        this.messageSource= messageSource;
    }
    protected Locale getLocale(HttpServletRequest request){
        HttpSession session = request.getSession();
        Locale locale = (Locale) session.getAttribute("locale");

        if (locale == null) {
            locale = Locale.ENGLISH;
            session.setAttribute("locale", locale);
        }
        return locale;
    }

}
