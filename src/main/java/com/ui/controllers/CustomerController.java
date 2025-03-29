package com.ui.controllers;

import com.ui.service.CountryService;
import com.ui.service.CustomerService;
import com.ui.util.FINAL;
import com.ui.util.InterMessage;
import org.springframework.stereotype.Controller;
import com.ui.model.Customer;
import com.ui.model.CurrentPage;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.Locale;
import java.util.Map;

@Controller
public class CustomerController extends ParentController{
    private static final Logger logger= LoggerFactory.getLogger(CustomerController.class);

    public CustomerController(CustomerService customerService,
                              CountryService countryService,
                              MessageSource messageSource){
        super(messageSource);
        this.customerService= customerService;
        this.countryService= countryService;
    }
    private InterMessage interMessage;
    private final CustomerService customerService;
    private final CountryService countryService;

    @GetMapping("/customer-form-vm")
    public String getCustomerForm(HttpServletRequest request, Model model){
        String lang= (String)request.getSession().getAttribute(FINAL.LANGUAGE);
        CurrentPage currentPage= new CurrentPage("Customer Form", "pages-jte/customer-form-vm", lang);
        request.getSession().setAttribute(FINAL.CURRENT_PAGE, currentPage);

        Map<String, String> countries = countryService.getAllCountries();
        model.addAttribute("countries", countries);

        model.addAttribute(FINAL.CURRENT_PAGE, currentPage);
        model.addAttribute("customer", new Customer());

        Locale locale= getLocale(request);
        interMessage= new InterMessage(messageSource, locale);
        model.addAttribute("interMessage", interMessage);

        logger.info("Customer Controller. Lang: "+ lang + "  Jte Page Name: "+ currentPage.getJteName());
        return "layout/master-vm";
    }

    @PostMapping("/save-customer-vm")
    public String saveUserVm(HttpServletRequest request, @Valid  @ModelAttribute("customer") Customer customer, BindingResult bindingResult, Model model){

        CurrentPage currentPage=(CurrentPage)request.getSession().getAttribute(FINAL.CURRENT_PAGE);
        if (bindingResult.hasErrors()) {
            currentPage.setError("Validation errors. Please enter required fields.");
            currentPage.setMessage(null);
            model.addAttribute("currentPage", currentPage);
            model.addAttribute("bindingResult", bindingResult);
            Map<String, String> countries = countryService.getAllCountries();
            model.addAttribute("countries", countries);
            logger.error("Validation errors num: customer-form-vm "+ bindingResult.getErrorCount());
            return "layout/master-vm";  // Return to the form with validation errors
        }

        // no validation errors. can save customer
        this.customerService.save(customer);
        currentPage.setMessage("Customer id: "+ customer.getCustomerId()+ "  name: "+ customer.getContactName()+ "  has been saved. ");
        currentPage.setError(null);
        model.addAttribute("currentPage", currentPage);
        logger.info("CustomerController. save-customer-vm. "+ currentPage.getMessage());
        return "layout/master-vm";
    }

//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public String handleValidationExceptions(MethodArgumentNotValidException ex, Model model, HttpServletRequest request){
//        String lang= (String)request.getSession().getAttribute(FINAL.LANGUAGE);
//        Customer customer= (Customer) ex.getBindingResult().getTarget();
//        model.addAttribute("customer", customer);
//        CurrentPage currentPage= new CurrentPage("Customer form","customer-form-vm", lang);
//        currentPage.setError("Please fill out all the required fields.");
//        model.addAttribute(FINAL.CURRENT_PAGE, currentPage);
//        //model.addAttribute("currentPage", currentPage);
//        model.addAttribute("messages", interMessage);
//        logger.info("CustomerController. Customer validation failed {}", customer);
//        return "layout/master-vm";
//    }

}
