package com.ui.util;

import org.springframework.context.MessageSource;
import java.util.Locale;
public class InterMessage {

    private final MessageSource messageSource;
    private final Locale locale;

    public InterMessage(MessageSource messageSource, Locale locale){
        this.messageSource= messageSource;
        this.locale= locale;
    }

    public String getMessage(String message){
        return this.messageSource.getMessage(message, null, locale);
    }

    public String getMessage(String message, String arg){
        return this.messageSource.getMessage(message, new Object[]{arg}, locale);
    }
}
