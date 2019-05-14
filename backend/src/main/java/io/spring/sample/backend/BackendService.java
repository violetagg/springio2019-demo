package io.spring.sample.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
public class BackendService {
	private final Flux<String> sessionsStream;

	public BackendService(SessionsRepository sessionsRepository) {
		this.sessionsStream = sessionsRepository.fetchSessionsStream();
	}

	@GetMapping("/proposeSession/{attendee}")
	public Mono<String> proposeSession(@PathVariable("attendee") String attendee) {
		int mod = attendee.hashCode() % 48;
		return sessionsStream.elementAt(mod)
				.map(s -> '\n' + s + "\n\n")
				.delayElement(Duration.ofSeconds(3));
	}
}
