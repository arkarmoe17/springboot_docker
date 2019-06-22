package com.example.docker_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerTestApplication {

	@RequestMapping("/")
	public String home(){
		return "Hello Docker World >>.";
	}

	@RequestMapping("/name/{name}")
    public String name(@PathVariable (name = "name") String name){
	    return "Welcome "+name;
    }


	public static void main(String[] args) {
		SpringApplication.run(DockerTestApplication.class, args);
	}

}
