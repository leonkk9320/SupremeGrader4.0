package com.lyingflat.sdd.supremegrader.controller;

import com.lyingflat.sdd.supremegrader.pojo.Question;
import com.lyingflat.sdd.supremegrader.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This is the controller layer for Question class
 */

@RestController
public class QuestionController {
    /**
     * dependency injection
     */
    @Autowired
    QuestionService questionService;


    /**
     * list all question information with "Get" request
     * @return a Json object containing all question information
     */
    @GetMapping("/listAllQuestions")
    public Map<String, Object> listAllQuestions() {
        Map<String, Object> result = new HashMap<>();
        List<Question> list = questionService.listAllQuestions();
        result.put("all questions", list);
        return result;
    }

    /**
     * list a certain question's information based on username with "Get" request
     * @param chapAndNum username of a question
     * @return a Json object containing a question's information
     */
    @GetMapping("/listQuestion")
    public Map<String, Object> listQuestion(String chapAndNum) {
        Map<String, Object> result = new HashMap<>();
        Question q = questionService.listQuestion(chapAndNum);
        result.put("list question", q);
        return result;
    }

    /**
     * insert a question's information into database with "Post" request
     * @param question a question object containing all information needed for the added question
     * @return a Json object containing true or false
     * @throws Exception some of the attributes cannot be null
     */
    @PostMapping("/insertQuestion")
    public Map<String, Object> insertQuestion(Question question) throws Exception {
        Map<String, Object> result = new HashMap<>();
        Boolean b = questionService.insertQuestion(question);
        result.put("insertQuestion", b);
        return result;
    }

    /**
     * update a question's information with "Post" request
     * @param question a question object containing all information needed for the updated question
     * @return a Json object containing true or false
     */
    @PostMapping("/updateQuestion")
    public Map<String, Object> updateQuestion(Question question) {
        Map<String, Object> result = new HashMap<>();
        Boolean b = questionService.updateQuestion(question);
        result.put("updatePatient", b);
        return result;
    }

    /**
     * delete a question's information based on username with "Get" request
     * @param chapAndNum username of a question
     * @return a Json object containing true or false
     */
    @GetMapping("/deleteQuestion")
    public Map<String, Object> deleteQuestion(String chapAndNum) {
        Map<String, Object> result = new HashMap<>();
        Boolean b = questionService.deleteQuestion(chapAndNum);
        result.put("deleteQuestion", b);
        return result;
    }
}
