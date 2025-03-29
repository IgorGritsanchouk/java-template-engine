package com.ui.controllers;

import com.ui.model.CurrentPage;
import com.ui.util.FINAL;
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

//    @GetMapping("/home")
//    public String getChild(HttpServletRequest request, Model model) {
//        String lang= (String)request.getSession().getAttribute(FINAL.LANGUAGE);
//        CurrentPage currentPage= new CurrentPage("Home", "Home Page", "Home page","home",lang);
//        model.addAttribute(FINAL.CURRENT_PAGE, currentPage);
//        request.getSession().setAttribute(FINAL.CURRENT_PAGE, currentPage);
//        logger.info("MasterController. Lang: "+ lang + "  Page: "+ currentPage.getJteName());
//        return "layout/master";  // This will render the 'parent.jte' template
//    }

    @GetMapping("/home-vm")
    public String getHome(HttpServletRequest request, Model model) {
        String lang= (String)request.getSession().getAttribute(FINAL.LANGUAGE);
        CurrentPage currentPage= new CurrentPage("Home", "pages-jte/home-vm", lang);
        model.addAttribute(FINAL.CURRENT_PAGE, currentPage);
        request.getSession().setAttribute(FINAL.CURRENT_PAGE, currentPage);
        logger.info("MasterController. Lang: "+ lang + "  Page: "+ currentPage.getJteName());
        return "layout/master-vm";  // This will render the 'parent.jte' template
    }

}
