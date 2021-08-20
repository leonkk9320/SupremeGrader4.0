package com.lyingflat.sdd.supremegrader.controller;

import com.lyingflat.sdd.supremegrader.pojo.Person;
import com.lyingflat.sdd.supremegrader.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This is the controller layer for Person class
 */

@RestController
public class PersonController {
    /**
     * dependency injection
     */
    @Autowired
    PersonService personService;

    /**
     * list all person information with "Get" request
     * @return a Json object containing all person information
     */
    @GetMapping("/listAllPersons")
    public Map<String, Object> listAllPersons() {
        Map<String, Object> result = new HashMap<>();
        List<Person> list = personService.listAllPersons();
        result.put("all persons", list);
        return result;
    }

    /**
     * list a certain person's information based on username with "Get" request
     * @param username username of a person
     * @return a Json object containing a person's information
     */
    @GetMapping("/listPerson")
    public Map<String, Object> listPerson(String username) {
        Map<String, Object> result = new HashMap<>();
        Person p = personService.listPerson(username);
        result.put("list person", p);
        return result;
    }


    /**
     * insert a person's information into database with "Post" request
     * @param person a Person object containing all information needed for the added person
     * @return a Json object containing true or false
     * @throws Exception some of the attributes cannot be null
     */
    @PostMapping("/insertPerson")
    public Map<String, Object> insertPerson(Person person) throws Exception {
        Map<String, Object> result = new HashMap<>();
        Boolean b = personService.insertPerson(person);
        result.put("insertPerson", b);
        return result;
    }


    /**
     * update a person's information with "Post" request
     * @param person a Person object containing all information needed for the updated person
     * @return a Json object containing true or false
     */
    @PostMapping("/updatePerson")
    public Map<String, Object> updatePerson(Person person) {
        Map<String, Object> result = new HashMap<>();
        Boolean b = personService.updatePerson(person);
        result.put("updatePerson", b);
        return result;
    }

    /**
     * delete a person's information based on username with "Get" request
     * @param username username of a person
     * @return a Json object containing true or false
     */
    @GetMapping("/deletePerson")
    public Map<String, Object> deletePerson(String username) {
        Map<String, Object> result = new HashMap<>();
        Boolean b = personService.deletePerson(username);
        result.put("deletePerson", b);
        return result;
    }
}
