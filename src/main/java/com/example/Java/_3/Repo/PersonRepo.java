package com.example.Java._3.Repo;

import com.example.Java._3.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {

    // SELECT * FROM Person where firstname = ""
    @Query("SELECT p FROM Person p WHERE p.name = ?1")
    Optional<Person> findByName(String name);

}
