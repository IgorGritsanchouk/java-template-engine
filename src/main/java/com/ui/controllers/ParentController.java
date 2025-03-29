package com.ui.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.context.MessageSource;
import com.ui.util.FINAL;
import org.springframework.stereotype.Controller;

import java.util.Locale;

@Controller
public class ParentController {

    protected final MessageSource messageSource;

    public ParentController(MessageSource messageSource){
        this.messageSource= messageSource;
    }
    protected Locale getLocale(HttpServletRequest request){
        HttpSession session = request.getSession();
        Locale locale = (Locale) session.getAttribute(FINAL.LOCALE);

        if (locale == null) {
            locale = Locale.ENGLISH;
            session.setAttribute(FINAL.LOCALE, locale);
        }
        return locale;
    }

}
