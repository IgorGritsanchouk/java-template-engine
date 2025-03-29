package com.ui;

import com.ui.ResourceRuntimeHints;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

//@ImportRuntimeHints(ResourceRuntimeHints.class)
@SpringBootApplication
public class UiJteApplication {

	public static void main(String[] args) {
		SpringApplication.run(UiJteApplication.class, args);
	}

}
