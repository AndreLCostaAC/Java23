package com.example.Java._3.Person;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.DECEMBER;
import static java.util.Calendar.JUNE;

@Configuration
public class PersonConfig {

    @Bean
    CommandLineRunner commandLineRunner(PersonRepo repo) {
        return args -> {
            Person Andre = new Person(
                    "André",
                    "andre@gmail.com",
                    LocalDate.of(1993, DECEMBER, 9)
                        );
            Person Franclim = new Person(
                    "Franclim",
                    "franclim@gmail.com",
                    LocalDate.of(1961, JUNE, 24)
            );

            repo.saveAll(List.of(Andre, Franclim));
        };
    }
}
