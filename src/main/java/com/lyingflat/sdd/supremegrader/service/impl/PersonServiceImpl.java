package com.lyingflat.sdd.supremegrader.service.impl;

import com.lyingflat.sdd.supremegrader.dao.PersonMapper;
import com.lyingflat.sdd.supremegrader.pojo.Person;
import com.lyingflat.sdd.supremegrader.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * implementation file of PersonService, most of the methods just call the methods in dao folder
 */

@Service
public class PersonServiceImpl implements PersonService {
    /**
     * dependency injection
     */
    @Autowired
    PersonMapper personMapper;

    @Override
    public List<Person> listAllPersons() {
        return personMapper.listAllPersons();
    }

    @Override
    public Person listPerson(String username) {
        return personMapper.listPerson(username);
    }

    /**
     * add aspect on verifying if username and password are null or not
     * @param person a person object containing all person's information
     * @return an Boolean object to indicate if update successfully or not
     * @throws Exception
     */
    @Override
    public Boolean insertPerson(Person person) throws Exception {
        if (person.getUsername() == null)
            throw new Exception("username cannot be null");
        if (person.getPassword() == null)
            throw new Exception("password cannot be null");
        return personMapper.insertPerson(person);
    }

    @Override
    public Boolean updatePerson(Person person) {
        return personMapper.updatePerson(person);
    }

    @Override
    public Boolean deletePerson(String username) {
        return personMapper.deletePerson(username);
    }
}
