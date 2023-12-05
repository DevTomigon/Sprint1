package com.mindhub.demo;

import com.mindhub.demo.Models.Client;
import com.mindhub.demo.Repositories.ClientRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HomebankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomebankingApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(ClientRepositories ClientRepositories){
		return args -> {
			Client tomas = new Client("Tomas", "Gonzalez", "tomigonzalez898@gmail.com");
			ClientRepositories.save(tomas);
		};
	}

}


