package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
/*
    @Bean
    CommandLineRunner initData(EmployeeRepository employeeRepository, MangerRepository managerRepository) {
        return args -> {
            Manager piotr1 = managerRepository.save(new Manager("Piotr"));
            Manager pawel1 = managerRepository.save(new Manager("Paweł"));
            Employee karol = employeeRepository.save(new Employee("Karol", "Męcik", "spedytor", BigDecimal.valueOf(15000), piotr1));
            Employee kasia = employeeRepository.save(new Employee("Kasia", "Klecik", "Cleaner", BigDecimal.valueOf(10000), pawel1));
            Employee kasia1 = employeeRepository.save(new Employee("Karolina", "Królik", "Cleaner", BigDecimal.valueOf(8000), piotr1));
            Employee karol1 = employeeRepository.save(new Employee("Darek", "Wróbel", "spedytor", BigDecimal.valueOf(5000), pawel1));
        };*/


    }



