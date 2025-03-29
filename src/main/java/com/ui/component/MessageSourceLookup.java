package com.ui.component;

import org.springframework.context.MessageSource;

import java.util.Locale;

public class MessageSourceLookup {

    private final MessageSource messageSource;
    private final Locale locale;

    public MessageSourceLookup(MessageSource messageSource, Locale locale){
        this.messageSource= messageSource;
        this.locale= locale;
    }

    public String lookup(String interMessage){
        return this.messageSource.getMessage(interMessage, null, locale);
    }

    public String lookup(String interMessage, String arg){
        return this.messageSource.getMessage(interMessage, new Object[]{arg}, locale);
    }
}
