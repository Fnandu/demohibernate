package com.liceu.demohibernate.controllers;

import com.liceu.demohibernate.models.Person;
import com.liceu.demohibernate.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {

    @Autowired
    TestService testService;
    @GetMapping("/")
    public String index(Model m){
        List<String> noms = new ArrayList<>();
        noms.add("Pablo");
        noms.add("Julio");
        noms.add("Tomeu");
        m.addAttribute("msg","Heyo");
        m.addAttribute("noms",noms);
        return "index.html";
    }

    @GetMapping("/persons")
    public String getPersons(Model m){
        List<Person> persones = testService.findAllPersons();
        m.addAttribute("persons",persones);
        return "person.html";
    }

    @GetMapping("/person/{nom}")
    public String getPerson(Model m, @PathVariable String nom) {
        List<Person> persones = testService.findPersonName(nom);
        m.addAttribute("persons",persones);
        return "person.html";
    }
}
