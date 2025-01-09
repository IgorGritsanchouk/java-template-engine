package com.jte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

@ImportRuntimeHints(ResourceRuntimeHints.class)
@SpringBootApplication
public class JavaTemplateEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaTemplateEngineApplication.class, args);
	}

}
