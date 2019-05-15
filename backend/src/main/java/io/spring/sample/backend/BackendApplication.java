package io.spring.sample.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.blockhound.BlockHound;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		BlockHound.install();
		SpringApplication.run(BackendApplication.class, args);
	}

}
