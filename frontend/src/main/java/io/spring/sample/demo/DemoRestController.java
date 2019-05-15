package io.spring.sample.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class DemoRestController {

	@GetMapping("/luckySession/{attendee}")
	public Mono<String> luckySession(@PathVariable("attendee") String attendee) {
		return WebClient.create()
				.get()
				.uri("http://localhost:8090/proposeSession/" + attendee)
				.retrieve()
				.bodyToMono(String.class);
	}
}
