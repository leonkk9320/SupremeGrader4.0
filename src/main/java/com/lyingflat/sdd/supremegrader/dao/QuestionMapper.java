package com.lyingflat.sdd.supremegrader.dao;

import com.lyingflat.sdd.supremegrader.dao.impl.PersonMapperImpl;
import com.lyingflat.sdd.supremegrader.dao.impl.QuestionMapperImpl;
import com.lyingflat.sdd.supremegrader.pojo.Person;
import com.lyingflat.sdd.supremegrader.pojo.Question;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * This is the dao(data access object) layer for question class
 */
@Repository
public interface QuestionMapper {
    /**
     * prototype of listAllQuestions method
     * @SelectProvider annotation indicates the implementation file and the method name in the implementation file
     * @return a list of Question objects
     */
    @SelectProvider(type = QuestionMapperImpl.class , method = "listAllQuestions")
    List<Question> listAllQuestions();

    /**
     * prototype of listQuestion method
     * @SelectProvider annotation indicates the implementation file and the method name in the implementation file
     * @param chapAndNum chapter name and number of a question
     * @return a Question object
     */
    @SelectProvider(type = QuestionMapperImpl.class , method = "listQuestion")
    Question listQuestion(@Param("chapAndNum") String chapAndNum);

    /**
     * prototype of listPerson method
     * @SelectProvider annotation indicates the implementation file and the method name in the implementation file
     * @param question a Question object
     * @return an Boolean object to indicate if insert successfully or not
     */
    @InsertProvider(type = QuestionMapperImpl.class, method = "insertQuestion")
    Boolean insertQuestion(@Param("question")Question question);

    /**
     * prototype of updatePerson method
     * @SelectProvider annotation indicates the implementation file and the method name in the implementation file
     * @param question a Question object
     * @return an Boolean object to indicate if update successfully or not
     */
    @UpdateProvider(type = QuestionMapperImpl.class, method = "updateQuestion")
    Boolean updateQuestion(@Param("question") Question question);

    /**
     * prototype of deletePerson method
     * @SelectProvider annotation indicates the implementation file and the method name in the implementation file
     * @param chapAndNum chapter name and number of a question
     * @return an Boolean object to indicate if delete successfully or not
     */
    @DeleteProvider(type = QuestionMapperImpl.class, method = "deleteQuestion")
    Boolean deleteQuestion(@Param("chapAndNum") String chapAndNum);
}
