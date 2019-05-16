package io.spring.sample.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.tools.agent.ReactorDebugAgent;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		ReactorDebugAgent.init();
		SpringApplication.run(BackendApplication.class, args);
	}

}
