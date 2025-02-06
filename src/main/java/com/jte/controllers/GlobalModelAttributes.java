package com.jte.controllers;

import com.jte.util.FinalVal;
import com.jte.util.MessageSourceWithLocale;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Locale;

@ControllerAdvice
public class GlobalModelAttributes {
    private MessageSource messageSource;
    public GlobalModelAttributes(MessageSource messageSource){
        this.messageSource= messageSource;
    }
    private final Logger logger= LoggerFactory.getLogger(GlobalModelAttributes.class);

    @ModelAttribute
    public void addGlobalAttributes(HttpServletRequest request, Model model) {

        Locale locale= getLocale(request);
        MessageSourceWithLocale messageSourceWithLocale= new MessageSourceWithLocale(messageSource, locale);
        request.getSession().setAttribute(FinalVal.LANGUAGE, locale.getLanguage());
        model.addAttribute("messages", messageSourceWithLocale);
        logger.info("GlobalModelAttributes. Adding global attribute messages for lang: "+ locale.getLanguage());
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
