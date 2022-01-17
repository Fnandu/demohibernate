package com.liceu.demohibernate.repositories;

import com.liceu.demohibernate.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepo extends JpaRepository<Person,Long> {
    List<Person> findByName(String name);
}
