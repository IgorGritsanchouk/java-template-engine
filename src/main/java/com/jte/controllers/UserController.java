package com.jte.controllers;

import com.jte.dao.UserDao;
import com.jte.domain.CurrentPage;
import com.jte.domain.User;
import com.jte.repository.UserRepository;
import com.jte.service.UserService;
import com.jte.service.UserServiceImpl;
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
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

@Controller
public class UserController extends ParentController{

    private static final Logger logger= LoggerFactory.getLogger(UserController.class);
    private final UserRepository userRepository;
    private final UserDao userDao;

    private final UserService userService;
    MessageSourceWithLocale messageSourceWithLocale;

    public UserController(UserRepository userRepository, UserDao userDao, MessageSource messageSource, UserServiceImpl userService){
        super(messageSource);
        this.userRepository= userRepository;
        this.userDao= userDao;
        this.userService= userService;
    }

    @GetMapping("/users-for-country")
    public String getUsersForCountry(@RequestParam String countryName, Model model){
//        // this is postgres function call which returns list of users for given country
//        List<User> users= userService.selectUsersForCountry(countryName);
//        logger.info("We get users :" + users.size() +" for: "+ countryName);
       return "redirect:/home-vm";
    }

    @GetMapping("/user-form")
    public String getUserForm(HttpServletRequest request, Model model){
        String lang= (String)request.getSession().getAttribute(FinalVal.LANGUAGE);
        CurrentPage currentPage= new CurrentPage("User form", "User Form VM", "User form with vertical menu","user-form",lang);
        model.addAttribute(FinalVal.CURRENT_PAGE, currentPage);
        request.getSession().setAttribute(FinalVal.CURRENT_PAGE, currentPage);
        model.addAttribute("user", new User());
        model.addAttribute("currentPage", currentPage);

        Locale locale= getLocale(request);
        messageSourceWithLocale= new MessageSourceWithLocale(messageSource, locale);
        logger.info("UserController. Lang: "+ lang + "  Page: "+ currentPage.getTemplateName());
        return "layout/master";
    }

    @PostMapping("/save-user")
    public String saveUser(HttpServletRequest request, @Valid User user, Model model){
        userRepository.save(user);
        //userService.saveUser(user);   // this is stored procedure call
        CurrentPage currentPage=(CurrentPage)request.getSession().getAttribute(FinalVal.CURRENT_PAGE);
        currentPage.setMessage("User: "+ user.getFirstName()+ "  has been saved. ");
        model.addAttribute("currentPage", currentPage);
        logger.info("UserController. save-user. "+ currentPage.getMessage());
        return "layout/master";
    }

//    @GetMapping("/user-form")
//    public String index(Model model){
//        model.addAttribute("user", new User());
//        return "pages/user-form";
//    }
//
//    @PostMapping("/save-user")
//    public String saveUser(@Valid User user, Model model){
//        userRepository.save(user);
//        model.addAttribute("message", "User: "+ user.getFirstName()+ "  has been saved. ");
//        return "pages/user-form";
//    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String handleValidationExceptions(MethodArgumentNotValidException ex, Model model){

        User user= (User) ex.getBindingResult().getTarget();
        model.addAttribute("user", user);
        CurrentPage currentPage= new CurrentPage("User form", "User Form", "User form","user-form", FinalVal.LANGUAGE_EN);
        currentPage.setError("Please fill out all the required fields.");
        model.addAttribute(FinalVal.CURRENT_PAGE, currentPage);
        model.addAttribute("currentPage", currentPage);
        model.addAttribute("messages", messageSourceWithLocale);
        logger.info("UserController. User validation failed {}", user);
        return "layout/master";
    }

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

//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public String handleValidationExceptions(MethodArgumentNotValidException ex, Model model){
//        User user= (User) ex.getBindingResult().getTarget();
//        model.addAttribute("user", user);
//        model.addAttribute("error", "Please fill out all the required fields.");
//        logger.info("User validation failed {}", user);
//        return "pages/user-form-template";
//    }
}
