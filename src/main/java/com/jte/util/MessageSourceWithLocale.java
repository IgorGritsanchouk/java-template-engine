package com.jte.util;

import org.springframework.context.MessageSource;

import java.util.Locale;

public class MessageSourceWithLocale {

    private final MessageSource messageSource;
    private final Locale locale;

    public MessageSourceWithLocale(MessageSource messageSource, Locale locale){
        this.messageSource= messageSource;
        this.locale= locale;
    }

    public String getInterMessage(String interMessage){
        return this.messageSource.getMessage(interMessage, null, locale);
    }

    public String getInterMessage(String interMessage, String arg){
        return this.messageSource.getMessage(interMessage, new Object[]{arg}, locale);
    }
}
