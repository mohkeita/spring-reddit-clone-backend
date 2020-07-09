package io.mohkeita.springreddit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringRedditCloneBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRedditCloneBackendApplication.class, args);
	}

}
