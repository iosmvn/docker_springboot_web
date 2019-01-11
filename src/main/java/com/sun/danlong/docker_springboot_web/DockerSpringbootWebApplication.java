package com.sun.danlong.docker_springboot_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class DockerSpringbootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringbootWebApplication.class, args);
	}

	@RequestMapping("")
	public String hello() {
		return "Hello! Docker! sundanlong";
	}

}

