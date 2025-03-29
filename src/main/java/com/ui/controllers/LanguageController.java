package com.ui.controllers;

import com.ui.model.CurrentPage;
import com.ui.util.FINAL;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

@Controller
public class LanguageController extends ParentController{

    private final Logger logger= LoggerFactory.getLogger(LanguageController.class);

    public LanguageController(MessageSource messageSource) {
        super(messageSource);
    }

//    @GetMapping("/language-selector")
//    public String languageSelector(HttpServletRequest request, Model model) {
//        HttpSession session = request.getSession();
//        Locale locale = (Locale) session.getAttribute("locale");
//
//        if (locale == null) {
//            locale = Locale.ENGLISH;
//            session.setAttribute("locale", locale);
//        }
//
////        String titleMessage= messageSource.getMessage("title.message", null, locale);
////        String welcomeMessage= messageSource.getMessage("welcome.message", null, locale);
////        String languageLabel= messageSource.getMessage("language.label", null, locale);
////
////        model.addAttribute("locale", locale.getLanguage()); //locale.getLanguage()
////        model.addAttribute("titleMessage", titleMessage);
////        model.addAttribute("welcomeMessage", welcomeMessage);
////        model.addAttribute("languageLabel", languageLabel);
//
//        return "pages/language-selector";
//    }

    @PostMapping("/change-language")
    public String changeLanguage(@RequestParam String language, HttpServletRequest request) {
        Locale locale = switch (language) {
            case "fr" -> Locale.FRENCH;
            case "es" -> new Locale("es");
            case "de" -> Locale.GERMAN;
            case "it" -> Locale.ITALIAN;
            default -> Locale.ENGLISH;
        };

        request.getSession().setAttribute("locale", locale);
        CurrentPage currentPage= (CurrentPage)request.getSession().getAttribute(FINAL.CURRENT_PAGE);
        logger.info("LanguageController. Changing Lang to: "+ language+ ". Moving to page: "+ currentPage.getJteName()+"  Mapping: "+currentPage.getMapping());

        return "redirect:/"+currentPage.getMapping();
        //return "redirect:/"+"home-vm";
    }

}
