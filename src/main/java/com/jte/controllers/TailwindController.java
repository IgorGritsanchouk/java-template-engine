package com.jte.controllers;

import com.jte.util.MessageSourceWithLocale;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

@Controller
public class TailwindController extends ParentController{

    public TailwindController(MessageSource messageSource){
        super(messageSource);
    }
    @GetMapping("/tail-wind")
    public String tailWind(HttpServletRequest request, Model model){
        Locale locale= getLocale(request);
        MessageSourceWithLocale messageSourceWithLocale= new MessageSourceWithLocale(messageSource, locale);
        model.addAttribute("messages", messageSourceWithLocale);
        return "pages/tail-wind";
    }

}
