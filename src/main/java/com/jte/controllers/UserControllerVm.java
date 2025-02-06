package com.jte.controllers;

import com.jte.domain.CurrentPage;
import com.jte.domain.User;
import com.jte.repository.UserRepository;
import com.jte.util.FinalVal;
import com.jte.util.MessageSourceWithLocale;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Locale;

@Controller
public class UserControllerVm extends ParentController{

    private static final Logger logger= LoggerFactory.getLogger(UserController.class);
    private final UserRepository userRepository;
    MessageSourceWithLocale messageSourceWithLocale;

    public UserControllerVm(UserRepository userRepository, MessageSource messageSource){
        super(messageSource);
        this.userRepository= userRepository;
    }

    @GetMapping("/user-form-vm")
    public String getUserFormVm(HttpServletRequest request, Model model){
        String lang= (String)request.getSession().getAttribute(FinalVal.LANGUAGE);
        CurrentPage currentPage= new CurrentPage("User form", "User Form VM", "User form with vertical menu","user-form-vm",lang);
        model.addAttribute(FinalVal.CURRENT_PAGE, currentPage);
        request.getSession().setAttribute(FinalVal.CURRENT_PAGE, currentPage);
        model.addAttribute("user", new User());
        model.addAttribute("currentPage", currentPage);

        Locale locale= getLocale(request);
        messageSourceWithLocale= new MessageSourceWithLocale(messageSource, locale);
        logger.info("UserController. Lang: "+ lang + "  Page: "+ currentPage.getTemplateName());
        return "layout/master-vm";
    }

    @PostMapping("/save-user-vm")
    public String saveUserVm(HttpServletRequest request, @Valid User user, Model model){
        userRepository.save(user);
        CurrentPage currentPage=(CurrentPage)request.getSession().getAttribute(FinalVal.CURRENT_PAGE);
        currentPage.setMessage("User: "+ user.getFirstName()+ "  has been saved. ");
        model.addAttribute("currentPage", currentPage);
        logger.info("UserController. save-user-vm. "+ currentPage.getMessage());
        return "layout/master-vm";
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String handleValidationExceptions(MethodArgumentNotValidException ex, Model model, HttpServletRequest request){
        String lang= (String)request.getSession().getAttribute(FinalVal.LANGUAGE);
        User user= (User) ex.getBindingResult().getTarget();
        model.addAttribute("user", user);
        CurrentPage currentPage= new CurrentPage("User form", "User Form VM", "User form with vertical menu","user-form-vm", lang);
        currentPage.setError("Please fill out all the required fields.");
        model.addAttribute(FinalVal.CURRENT_PAGE, currentPage);
        model.addAttribute("currentPage", currentPage);
        model.addAttribute("messages", messageSourceWithLocale);
        logger.info("UserController. User validation failed {}", user);
        return "layout/master-vm";
    }
}
