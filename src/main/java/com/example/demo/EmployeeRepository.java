package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
        List<Employee> findByNameContains(@Param("q") String name);
        Optional<Employee> findByRole(Long id);
        Optional<Employee> findByName(Long id);
        Optional<Employee> findBySurname(Long id);
        List<Employee> findByManager(@Param("q") String name);



}
