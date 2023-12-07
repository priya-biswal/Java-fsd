package com.example.AwsDeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsDeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsDeployApplication.class, args);
		System.out.println("hello aws");
	}

}
