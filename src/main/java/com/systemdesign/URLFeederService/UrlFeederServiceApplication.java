package com.systemdesign.URLFeederService;

import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan
// @EnableAutoConfiguration --- IGNORE ---
@EnableJpaRepositories(basePackages = "com.systemdesign.URLFeederService.repository")
public class UrlFeederServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UrlFeederServiceApplication.class, args);
	}

}
