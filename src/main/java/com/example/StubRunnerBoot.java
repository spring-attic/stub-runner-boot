package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.contract.stubrunner.server.EnableStubRunnerServer;

@SpringBootApplication
@EnableStubRunnerServer
public class StubRunnerBoot {

	public static void main(String[] args) {
		SpringApplication.run(StubRunnerBoot.class, args);
	}
}

