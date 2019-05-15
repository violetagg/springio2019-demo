package io.spring.sample.backend;

import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

@Component
public class SessionsRepository {


	public Flux<String> fetchSessionsStream() {
		return Flux.fromIterable(SESSIONS);
	}

	private static final List<String> SESSIONS;
	static {
		List<String> sessionsList = new ArrayList<>();
		sessionsList.add("Moving from Imperative to Reactive");
		sessionsList.add("The State of Java Relational Persistence");
		sessionsList.add("Benefits of reactive programming with Reactor and Spring Boot 2");
		sessionsList.add("Managing Dependencies for Spring Projects with Gradle");
		sessionsList.add("Chaos Engineering - withstanding turbulent conditions in production");
		sessionsList.add("Building better monoliths – Implementing modulithic applications with Spring");
		sessionsList.add("Spring Security for N00bz: A quick introduction for the terminally insecure");
		sessionsList.add("Configuration Management with Kubernetes, a Spring Boot use-case");
		sessionsList.add("Moving beyond REST: GraphQL and Java & Spring");
		sessionsList.add("Fully Reactive: Spring, Kotlin & JavaFX playing together");
		sessionsList.add("Cutting-edge Continuous Delivery: Automated Canary Analysis through Spring-based Spinnaker");
		sessionsList.add("What the Graph?");
		sessionsList.add("Spring Framework 5.2: Core Container Revisited");
		sessionsList.add("Spring and the Mystery of the Polyglot Stack");
		sessionsList.add("Java Modules in practice with Spring Boot");
		sessionsList.add("Kubernetes and/or Cloud Foundry - How to run your Spring Boot Microservices on state-of-the-art cloud platforms");
		sessionsList.add("Breaking the Magician's Code: Diving deeper into Spring Boot internals");
		sessionsList.add("Stream Processing with the Spring Framework (Like You’ve Never Seen It Before)");
		sessionsList.add("JUnit 5: what's new and what's coming");
		sessionsList.add("From OWASP top 10 to Secure Applications");
		sessionsList.add("Spring to Google Cloud Native");
		sessionsList.add("How Fast is Spring");
		sessionsList.add("Migrating a modern spring web application to serverless");
		sessionsList.add("Distributed Tracing in the Wild");
		sessionsList.add("GraalVM for Java developers");
		sessionsList.add("Going Cloud Native with Spring Cloud Azure");
		sessionsList.add("Event Driven with Spring");
		sessionsList.add("Reactive Relational Database Connectivity");
		sessionsList.add("Cloud Native Spring Boot Admin");
		sessionsList.add("Connect Your Car With Spring Tools");
		sessionsList.add("Clean Architecture with Spring");
		sessionsList.add("Testing Spring Boot Applications");
		sessionsList.add("How to live in a post-Spring-Cloud-Netflix world");
		sessionsList.add("Efficient web apps with Spring Boot 2");
		sessionsList.add("Real Time Investment Alerts using Apache Kafka & Spring Kafka at ING Bank");
		sessionsList.add("How to secure your Spring apps with Keycloak");
		sessionsList.add("Boot Loot - up your game and Spring like the pros");
		sessionsList.add("Implementing Microservices Security Patterns & Protocols with Spring Security 5");
		sessionsList.add("Collaborative Contract Driven Development");
		sessionsList.add("Spring Boot with Kotlin, Kofu and Coroutines");
		sessionsList.add("How to bootifully make a front-end with JHipster and Vue.js for your application");
		sessionsList.add("How to build Reactive Server in 50 minutes?");
		sessionsList.add("Event-Driven Microservices with Axon and Spring Boot: excitingly boring");
		sessionsList.add("Multi-Service Reactive Streams Using Spring, Reactor, and RSocket");
		sessionsList.add("Managing Business Processes in Microservice Architecture with Spring Ecosystem");
		sessionsList.add("Spring Cloud on Kubernetes");
		sessionsList.add("Zero Downtime Migrations with Spring Boot");
		sessionsList.add("Building resilient scheduling in distributed systems with Spring");
		SESSIONS = sessionsList;
	}
}
