package org.sample.admin.springbootadminweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminWebApplication.class, args);
	}
}
