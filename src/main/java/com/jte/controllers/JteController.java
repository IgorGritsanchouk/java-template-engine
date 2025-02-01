package com.jte.controllers;

import com.jte.domain.IgPage;
import com.jte.domain.Page;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

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
    public String jteLayout(Model model){
        IgPage igPage= new IgPage("Philip", "Title Phil Page", "Description For Layout");
        model.addAttribute("igPage", igPage);
        return "layout";
    }


}
