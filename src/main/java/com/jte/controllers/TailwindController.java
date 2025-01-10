package com.jte.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TailwindController {

    @GetMapping("/tail-wind")
    public String tailWind(){
        return "pages/tail-wind";
    }

}
