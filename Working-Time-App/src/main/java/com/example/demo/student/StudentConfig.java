package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;




@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(
			StudentRepository repository) {
		return args -> {
			Student arek = new Student(
					"Arek",
					"awajs.cw@mmm.com",
					LocalDate.of(2021, 12, 12)				
				);
			Student alex = new Student(
					"Alex",
					"alopez.cw@mmm.com",
					LocalDate.of(1993, 4, 28)					
				);
			
			repository.saveAll(
					List.of(arek, alex)
			);
		};
	}
}
