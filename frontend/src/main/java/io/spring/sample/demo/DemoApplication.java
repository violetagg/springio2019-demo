package io.spring.sample.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.blockhound.BlockHound;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		BlockHound.install();
		SpringApplication.run(DemoApplication.class, args);
	}

}
