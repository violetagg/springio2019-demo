package io.spring.sample.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoRestController {

	@GetMapping("/luckySession/{attendee}")
	public ResponseEntity<String> luckySession(@PathVariable("attendee") String attendee) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForEntity("http://localhost:8090/proposeSession/" + attendee, String.class);
	}
}
