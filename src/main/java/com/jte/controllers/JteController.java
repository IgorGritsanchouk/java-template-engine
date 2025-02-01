package com.jte.controllers;

import com.jte.domain.IgPage;
import com.jte.domain.Page;
import com.jte.util.MessageSourceWithLocale;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Locale;

@Controller
public class JteController extends ParentController{

    public JteController(MessageSource messageSource){
        super(messageSource);
    }
    @GetMapping("/index-jte")
    public String jteHome(Model model){
        var items= List.of("Item1","Item2","Item3");
        var page= new Page("Hello, Java Template Engine","This is my home page");
        model.addAttribute("name", "Philip");
        model.addAttribute("page", page);
        model.addAttribute("items", items);
        return "index";
    }

    @GetMapping("/layout-jte")
    public String jteLayout(HttpServletRequest request, Model model){
        IgPage igPage= new IgPage("Philip", "Title Phil Page", "Description For Layout","fr");
        model.addAttribute("igPage", igPage);
        Locale locale= getLocale(request);
        MessageSourceWithLocale messageSourceWithLocale= new MessageSourceWithLocale(messageSource, locale);
        model.addAttribute("messages", messageSourceWithLocale);
        return "vmenu-la/layout";
    }


}
