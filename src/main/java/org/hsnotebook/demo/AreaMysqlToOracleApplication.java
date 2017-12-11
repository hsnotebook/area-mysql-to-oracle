package org.hsnotebook.demo;

import org.hsnotebook.demo.service.ConvertService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AreaMysqlToOracleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AreaMysqlToOracleApplication.class, args);
	}
	
	@Bean
	CommandLineRunner run(ConvertService convertService) {
		return arg -> {
			convertService.convert();
		};
	}
}
