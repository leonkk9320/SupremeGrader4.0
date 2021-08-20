package com.lyingflat.sdd.supremegrader.dao;

import com.lyingflat.sdd.supremegrader.dao.impl.PersonMapperImpl;
import com.lyingflat.sdd.supremegrader.pojo.Person;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * This is the dao(data access object) layer for person class
 */
@Repository
public interface PersonMapper {
    /**
     * prototype of listAllPersons method
     * @SelectProvider annotation indicates the implementation file and the method name in the implementation file
     * @return a list of Person objects
     */
    @SelectProvider(type = PersonMapperImpl.class , method = "listAllPersons")
    List<Person> listAllPersons();

    /**
     * prototype of listPerson method
     * @SelectProvider annotation indicates the implementation file and the method name in the implementation file
     * @param username username of a person
     * @return a Person object
     */
    @SelectProvider(type = PersonMapperImpl.class , method = "listPerson")
    Person listPerson(@Param("username") String username);

    /**
     * prototype of listPerson method
     * @SelectProvider annotation indicates the implementation file and the method name in the implementation file
     * @param person a Person object
     * @return an Boolean object to indicate if insert successfully or not
     */
    @InsertProvider(type = PersonMapperImpl.class, method = "insertPerson")
    Boolean insertPerson(@Param("person")Person person);

    /**
     * prototype of updatePerson method
     * @SelectProvider annotation indicates the implementation file and the method name in the implementation file
     * @param person a Person object
     * @return an Boolean object to indicate if update successfully or not
     */
    @UpdateProvider(type = PersonMapperImpl.class, method = "updatePerson")
    Boolean updatePerson(@Param("person") Person person);

    /**
     * prototype of deletePerson method
     * @SelectProvider annotation indicates the implementation file and the method name in the implementation file
     * @param username username of a person
     * @return an Boolean object to indicate if delete successfully or not
     */
    @DeleteProvider(type = PersonMapperImpl.class, method = "deletePerson")
    Boolean deletePerson(@Param("username") String username);
}
