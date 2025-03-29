package com.ui.controllers;

import com.ui.model.Order;
import com.ui.model.OrderForm;
import com.ui.service.OrderService;
import org.springframework.stereotype.Controller;
import com.ui.service.CountryService;
import com.ui.util.FINAL;
import com.ui.util.InterMessage;
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

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Locale;
import java.util.Map;

@Controller
public class OrderController extends ParentController {

    public OrderController(CountryService countryService,
                           OrderService orderService,
                           MessageSource messageSource){
        super(messageSource);
        this.orderService= orderService;
        this.countryService= countryService;
    }

    public final Logger logger= LoggerFactory.getLogger(OrderController.class);

    private final CountryService countryService;
    private final OrderService orderService;
    private InterMessage interMessage;

    @GetMapping("order-form-vm")
    public String getOrderForm(HttpServletRequest request, Model model) {
        String lang= (String)request.getSession().getAttribute(FINAL.LANGUAGE);
        CurrentPage currentPage= new CurrentPage("Order Form", "pages-jte/order-form-vm", lang);
        request.getSession().setAttribute(FINAL.CURRENT_PAGE, currentPage);

        Map<String, String> countries = countryService.getAllCountries();
        model.addAttribute("countries", countries);

        Order order= new Order();
        order.setRequiredDate(new Date(System.currentTimeMillis()));
        order.setShippedDate(new Date(System.currentTimeMillis()));
        order.setTotalAmount(new BigDecimal("0.00"));
        order.setTrackingNumber("TRK"+System.currentTimeMillis());

        OrderForm orderForm= new OrderForm();
        orderForm.setCountries(countryService.getAllCountries());
        orderForm.setCustomerDropDown(orderService.getCustomerDropDown());
        orderForm.setEmployeeDropDown(orderService.getEmployeeDropDown());

        model.addAttribute(FINAL.CURRENT_PAGE, currentPage);
        model.addAttribute("orderForm", orderForm);
        model.addAttribute("order", order);

        Locale locale= getLocale(request);
        interMessage= new InterMessage(messageSource, locale);
        model.addAttribute("interMessage", interMessage);

        logger.info("Controller. Lang: "+ lang + "  Jte Page Name: "+ currentPage.getJteName());
        return "layout/master-vm";
    }

    @PostMapping("/save-order-vm")
    public String saveOrderVm(HttpServletRequest request, @Valid @ModelAttribute("order") Order order, BindingResult bindingResult, Model model){

        OrderForm orderForm= new OrderForm();
        orderForm.setCountries(countryService.getAllCountries());
        orderForm.setCustomerDropDown(orderService.getCustomerDropDown());
        orderForm.setEmployeeDropDown(orderService.getEmployeeDropDown());

        order.setOrderDate(new java.sql.Timestamp(System.currentTimeMillis()));

        CurrentPage currentPage=(CurrentPage)request.getSession().getAttribute(FINAL.CURRENT_PAGE);
        if (bindingResult.hasErrors()) {
            currentPage.setError("Validation errors. Please enter required fields.");
            currentPage.setMessage(null);

            model.addAttribute("orderForm", orderForm);
            model.addAttribute("currentPage", currentPage);
            model.addAttribute("bindingResult", bindingResult);
            logger.error("Validation errors num: order-form-vm : "+ bindingResult.getErrorCount());
            return "layout/master-vm";  // Return to the form with validation errors
        }

        // no validation errors. can save customer
        this.orderService.save(order);
        currentPage.setMessage("Order id: "+ order.getOrderId()+ "  order status: "+ order.getOrderStatus()+ "  has been saved. ");
        currentPage.setError(null);

        model.addAttribute("orderForm", orderForm);
        model.addAttribute("currentPage", currentPage);
        logger.info("save-order-vm. "+ currentPage.getMessage());
        return "layout/master-vm";
    }

    // this is just for testing
//    @GetMapping("default-form-vm")
//    public String getDefaultForm(HttpServletRequest request, Model model) {
//        String lang= (String)request.getSession().getAttribute(FINAL.LANGUAGE);
//        CurrentPage currentPage= new CurrentPage("Default Form", "pages-jte/default-form-vm", lang);
//        request.getSession().setAttribute(FINAL.CURRENT_PAGE, currentPage);
//
////        Map<String, String> countries = countryService.getAllCountries();
////        model.addAttribute("countries", countries);
////
//        Order order= new Order();
//        order.setRequiredDate(new java.sql.Date(System.currentTimeMillis()));
//        model.addAttribute("order", order);
//
//        model.addAttribute(FINAL.CURRENT_PAGE, currentPage);
//
//        Locale locale= getLocale(request);
//        interMessage= new InterMessage(messageSource, locale);
//        model.addAttribute("interMessage", interMessage);
//
//        logger.info("CustomerOrder Controller. Lang: "+ lang + "  Jte Page Name: "+ currentPage.getJteName());
//        return "layout/master-vm";
//    }

//    @PostMapping("/save-default-vm")
//    public String saveDefaultVm(HttpServletRequest request, @Valid @ModelAttribute("order") Order order, BindingResult bindingResult, Model model){
//
//        CurrentPage currentPage=(CurrentPage)request.getSession().getAttribute(FINAL.CURRENT_PAGE);
//        if (bindingResult.hasErrors()) {
//            currentPage.setError("Validation errors. Please enter required fields.");
//            currentPage.setMessage(null);
//            model.addAttribute("currentPage", currentPage);
//            model.addAttribute("bindingResult", bindingResult);
//            Map<String, String> countries = countryService.getAllCountries();
//            model.addAttribute("countries", countries);
//            logger.error("Validation errors num: customer-form-vm "+ bindingResult.getErrorCount());
//            return "layout/master-vm";  // Return to the form with validation errors
//        }
//
//        // no validation errors. can save customer
//        this.orderService.save(order);
//        currentPage.setMessage("Customer id: "+ order.getOrderId()+ "  order status: "+ order.getOrderStatus()+ "  has been saved. ");
//        currentPage.setError(null);
//        model.addAttribute("currentPage", currentPage);
//        logger.info("CustomerController. save-order-vm. "+ currentPage.getMessage());
//        return "layout/master-vm";
//    }

}
