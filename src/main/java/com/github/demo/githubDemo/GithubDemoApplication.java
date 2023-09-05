package com.github.demo.githubDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubDemoApplication {

	
	@GetMapping("/demo")
	public String getGitHubDemo() {
		return "Call GitHubDemo ";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(GithubDemoApplication.class, args);
	}

}
