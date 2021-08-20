package com.lyingflat.sdd.supremegrader.service;

import com.lyingflat.sdd.supremegrader.pojo.Person;

import java.util.List;

/**
 * This is the service layer for person class
 */

public interface PersonService {
    /**
     * prototype of listAllPersons method
     * @return a list of Person objects
     */
    List<Person> listAllPersons();
    /**
     * prototype of listPerson method
     * @return a Person object
     */
    Person listPerson(String username);
    /**
     * prototype of insertPerson method
     * @return an Boolean object to indicate if insert successfully or not
     */
    Boolean insertPerson(Person person) throws Exception;
    /**
     * prototype of updatePerson method
     * @return an Boolean object to indicate if update successfully or not
     */
    Boolean updatePerson(Person person);
    /**
     * prototype of deletePerson method
     * @return an Boolean object to indicate if update successfully or not
     */
    Boolean deletePerson(String username);
}
