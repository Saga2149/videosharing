package com.project1.videosharing;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;


@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
public class VideosharingApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideosharingApplication.class, args);
	}

}
