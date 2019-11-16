package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface MangerRepository extends CrudRepository<Manager,Long> {
    List<Manager> findByNameContains(@Param("q") String name);
    Optional<Manager> findByName(String name);
    List<Manager> findByEmployeesSurname(String surname);
    List<Manager> findByEmployeesRole(String role);
    @Query("select count(p) from Manager p")
    Long findCount();


}
