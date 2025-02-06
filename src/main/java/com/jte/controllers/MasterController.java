package com.jte.controllers;

import com.jte.domain.CurrentPage;
import com.jte.util.FinalVal;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MasterController {

    private final Logger logger= LoggerFactory.getLogger(MasterController.class);

    @GetMapping("/")
    public String getStart(HttpServletRequest request, Model model) {
        return "redirect:/home-vm";
    }
    @GetMapping("/home")
    public String getChild(HttpServletRequest request, Model model) {
        String lang= (String)request.getSession().getAttribute(FinalVal.LANGUAGE);
        CurrentPage currentPage= new CurrentPage("Home", "Home Page", "Home page","home",lang);
        model.addAttribute(FinalVal.CURRENT_PAGE, currentPage);
        request.getSession().setAttribute(FinalVal.CURRENT_PAGE, currentPage);
        logger.info("MasterController. Lang: "+ lang + "  Page: "+ currentPage.getTemplateName());
        return "layout/master";  // This will render the 'parent.jte' template
    }

    @GetMapping("/home-vm")
    public String getHome(HttpServletRequest request, Model model) {
        String lang= (String)request.getSession().getAttribute(FinalVal.LANGUAGE);
        CurrentPage currentPage= new CurrentPage("Home", "Home Page", "Home page","home-vm",lang);
        model.addAttribute(FinalVal.CURRENT_PAGE, currentPage);
        request.getSession().setAttribute(FinalVal.CURRENT_PAGE, currentPage);
        logger.info("MasterController. Lang: "+ lang + "  Page: "+ currentPage.getTemplateName());
        return "layout/master-vm";  // This will render the 'parent.jte' template
    }

}
