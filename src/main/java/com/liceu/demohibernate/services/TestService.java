package com.liceu.demohibernate.services;

import com.liceu.demohibernate.models.Person;
import com.liceu.demohibernate.repositories.JobRepo;
import com.liceu.demohibernate.repositories.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    JobRepo jobRepo;

    @Autowired
    PersonRepo personRepo;

    public List<Person> findAllPersons(){
        return personRepo.findAll();
    }

    public List<Person> findPersonName(String nom){
        return personRepo.findByName(nom);
    }
}
