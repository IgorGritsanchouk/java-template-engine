package com.jte.controllers;

import com.jte.domain.User;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import com.jte.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private static final Logger logger= LoggerFactory.getLogger(UserController.class);
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository= userRepository;
    }

    @GetMapping("/user-form")
    public String index(Model model){
        model.addAttribute("user", new User());
        return "pages/user-form";
    }

    @PostMapping("/save-user")
    public String saveUser(@Valid User user, Model model){
        userRepository.save(user);
        model.addAttribute("message", "User: "+ user.getFirstName()+ "  has been saved. ");
        return "pages/user-form";
    }

//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public String handleValidationExceptions(MethodArgumentNotValidException ex, Model model){
//        User user= (User) ex.getBindingResult().getTarget();
//        model.addAttribute("user", user);
//        model.addAttribute("error", "Please fill out all the required fields.");
//        logger.info("User validation failed {}", user);
//        return "pages/user-form";
//    }

    @GetMapping("/user-form-template")
    public String userFormTemplate(Model model){
        model.addAttribute("user", new User());
        return "pages/user-form-template";
    }

    @PostMapping("/save-user-template")
    public String saveUserTemplate(@Valid User user, Model model){
        userRepository.save(user);
        model.addAttribute("message", "User: "+ user.getFirstName()+ "  has been saved. ");
        return "pages/user-form-template";
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String handleValidationExceptions(MethodArgumentNotValidException ex, Model model){
        User user= (User) ex.getBindingResult().getTarget();
        model.addAttribute("user", user);
        model.addAttribute("error", "Please fill out all the required fields.");
        logger.info("User validation failed {}", user);
        return "pages/user-form-template";
    }
}
