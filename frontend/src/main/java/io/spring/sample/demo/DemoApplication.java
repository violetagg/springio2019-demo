package io.spring.sample.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.tools.agent.ReactorDebugAgent;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ReactorDebugAgent.init();
		SpringApplication.run(DemoApplication.class, args);
	}

}
