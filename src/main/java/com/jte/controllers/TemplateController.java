package com.jte.controllers;

import com.jte.util.MessageSourceWithLocale;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@Controller
public class TemplateController {

    private final Logger logger= LoggerFactory.getLogger(TemplateController.class);
    private final MessageSource messageSource;

    public TemplateController(MessageSource messageSource){
        this.messageSource= messageSource;
    }

//    @GetMapping("/layout")
//    public String layout(HttpServletRequest request, Model model) {
//        Locale locale= getLocale(request);
//        MessageSourceWithLocale messageSourceWithLocale= new MessageSourceWithLocale(messageSource, locale);
//        model.addAttribute("messageSourceWithLocale", messageSourceWithLocale);
//        return "layout/main";
//    }

    @GetMapping("/")
    public String home(HttpServletRequest request, Model model) {
        Locale locale= getLocale(request);
        MessageSourceWithLocale messageSourceWithLocale= new MessageSourceWithLocale(messageSource, locale);
        model.addAttribute("messages", messageSourceWithLocale);
        return "pages/home";
    }

    @GetMapping("/team")
    public String team(Model model) {
        List<String> teamMembers = Arrays.asList("Alice", "Bob", "Charlie", "David");
        model.addAttribute("teamMembers", teamMembers);
        return "pages/team";
    }

    @GetMapping("/projects")
    public String projects(HttpServletRequest request, Model model) {
        Locale locale= getLocale(request);
        MessageSourceWithLocale messageSourceWithLocale= new MessageSourceWithLocale(messageSource, locale);

        String ourProjectsLabel= messageSource.getMessage("our_projects.label", null, locale);
        String project1= messageSourceWithLocale.getInterMessage("project1.label");
        String project2= messageSourceWithLocale.getInterMessage("project2.label");
        String project3= messageSourceWithLocale.getInterMessage("project3.label");

        List<String> projects = List.of(project1, project2, project3);
        model.addAttribute("messages", messageSourceWithLocale);
        model.addAttribute("projects", projects);
        return "pages/projects";
    }

    private Locale getLocale(HttpServletRequest request){
        HttpSession session = request.getSession();
        Locale locale = (Locale) session.getAttribute("locale");

        if (locale == null) {
            locale = Locale.ENGLISH;
            session.setAttribute("locale", locale);
        }
        return locale;
    }
}
