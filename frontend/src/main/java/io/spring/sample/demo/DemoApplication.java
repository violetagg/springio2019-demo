package io.spring.sample.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Hooks;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Hooks.onOperatorDebug();
		SpringApplication.run(DemoApplication.class, args);
	}

}
