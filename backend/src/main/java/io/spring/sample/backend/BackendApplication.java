package io.spring.sample.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Hooks;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		Hooks.onOperatorDebug();
		SpringApplication.run(BackendApplication.class, args);
	}

}
