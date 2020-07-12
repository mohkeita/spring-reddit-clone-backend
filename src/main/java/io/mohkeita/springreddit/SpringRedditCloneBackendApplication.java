package io.mohkeita.springreddit;

import io.mohkeita.springreddit.config.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@Import(SwaggerConfiguration.class)
public class SpringRedditCloneBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRedditCloneBackendApplication.class, args);
	}

}
