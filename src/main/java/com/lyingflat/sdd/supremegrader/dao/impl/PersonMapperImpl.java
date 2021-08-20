package com.lyingflat.sdd.supremegrader.dao.impl;

import com.lyingflat.sdd.supremegrader.pojo.Person;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

/**
 * implementation file of PersonMapper
 */

public class PersonMapperImpl {
    /**
     * implementation of listAllPersons
     * @return a String of sql code
     */
    public String listAllPersons() {
        return new SQL(){{
            SELECT("*");
            FROM("person");
        }}.toString();
    }

    /**
     * implementation of listPerson
     * @return a String of sql code
     */
    public String listPerson(Map<String,Object> param) {
        return new SQL(){{
            SELECT("*");
            FROM("person");
            WHERE("username = " + "'" + param.get("username") + "'");
        }}.toString();
    }

    /**
     * implementation of insertPerson
     * @return a String of sql code
     */
    public String insertPerson(Map<String,Object> param) {
        return new SQL() {{
            INSERT_INTO("person");
            VALUES("personUuid", "'"+((Person) param.get("person")).getPersonUuid()+"'");
            if(((Person) param.get("person")).getUsername() != null)
                VALUES("username",  "'" + ((Person) param.get("person")).getUsername()+"'");
            if(((Person) param.get("person")).getPassword() != null)
                VALUES("password",  "'" + ((Person) param.get("person")).getPassword()+"'");
        }}.toString();
    }

    /**
     * implementation of updatePerson
     * @return a String of sql code
     */
    public String updatePerson(Map<String,Object> param) {
        return new SQL(){{
            UPDATE("person");
            if(((Person) param.get("person")).getPassword() != null)
                SET("password = " + "'" + ((Person) param.get("person")).getPassword()+"'");
            WHERE("username =" + "'" + ((Person) param.get("person")).getUsername()+"'");
        }}.toString();
    }


    /**
     * implementation of deletePerson
     * @return a String of sql code
     */
    public String deletePerson(Map<String, Object> param) {
        return new SQL(){{
            DELETE_FROM("person");
            WHERE("username = " + "'" + param.get("username") + "'");
        }}.toString();
    }
}
