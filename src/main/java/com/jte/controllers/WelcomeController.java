package com.jte.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;
@Controller
public class WelcomeController
{
//	@RequestMapping("/welcome")
//	public String locale()
//	{
//		return "pages/welcome";
//	}

	private final MessageSource messageSource;

	public WelcomeController(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@GetMapping("/welcome")
	public String welcome(Model model, Locale locale) {
		String welcomeMessage = messageSource.getMessage("welcome.message", null, locale);
		model.addAttribute("welcomeMessage", welcomeMessage);
		return "pages/welcome";
	}

}
