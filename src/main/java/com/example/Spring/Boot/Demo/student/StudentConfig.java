package com.example.Spring.Boot.Demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student mariam = new Student(

                    "Mariam",
                    "Mariam.ahmed@gmail.com",
                    LocalDate.of(1990, 5, 5)
            );

            Student alex = new Student(

                    "Alex",
                    "Alex@gmail.com",
                    LocalDate.of(2000, 4,4 )
            );
          repository.saveAll(List.of(mariam,alex));

        };
    }
}
