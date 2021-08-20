package com.lyingflat.sdd.supremegrader.service;


import com.lyingflat.sdd.supremegrader.pojo.Question;

import java.util.List;

/**
 * This is the service layer for question class
 */

public interface QuestionService {
    /**
     * prototype of listAllQuestions method
     * @return a list of Question objects
     */
    List<Question> listAllQuestions();
    /**
     * prototype of listQuestion method
     * @return a Question object
     */
    Question listQuestion(String chapAndNum);
    /**
     * prototype of insertQuestion method
     * @return an Boolean object to indicate if insert successfully or not
     */
    Boolean insertQuestion(Question question) throws Exception;
    /**
     * prototype of updateQuestion method
     * @return an Boolean object to indicate if update successfully or not
     */
    Boolean updateQuestion(Question question);
    /**
     * prototype of deleteQuestion method
     * @return an Boolean object to indicate if update successfully or not
     */
    Boolean deleteQuestion(String chapAndNum);
}
