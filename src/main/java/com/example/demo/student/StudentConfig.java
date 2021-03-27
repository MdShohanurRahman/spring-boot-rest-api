package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student shohan = new Student(
                    "shohan",
                    "shohan.drmc@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );
            Student shohan1 = new Student(
                    "shohan1",
                    "shohan1.drmc@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            repository.saveAll(
                    List.of(shohan, shohan1)
            );
        };
    }
}
