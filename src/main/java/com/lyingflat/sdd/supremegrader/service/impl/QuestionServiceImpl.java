package com.lyingflat.sdd.supremegrader.service.impl;

import com.lyingflat.sdd.supremegrader.dao.QuestionMapper;
import com.lyingflat.sdd.supremegrader.pojo.Question;
import com.lyingflat.sdd.supremegrader.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * implementation file of QuestionService, most of the methods just call the methods in dao folder
 */

@Service
public class QuestionServiceImpl implements QuestionService {
    /**
     * dependency injection
     */
    @Autowired
    private QuestionMapper questionMapper;

    @Override
    public List<Question> listAllQuestions() {
        return questionMapper.listAllQuestions();
    }

    @Override
    public Question listQuestion(String chapAndNum) {
        return questionMapper.listQuestion(chapAndNum);
    }

    /**
     * add an aspect on verifying if chapAndNum and description are null or not
     * @param question a Question object containing all person's information
     * @return an Boolean object to indicate if update successfully or not
     * @throws Exception
     */
    @Override
    public Boolean insertQuestion(Question question) throws Exception {
        if (question.getChapAndNum() == null)
            throw new Exception("question chapter and number cannot be null");
        if (question.getDescription() == null)
            throw new Exception("question description cannot be null");
        return questionMapper.insertQuestion(question);
    }

    @Override
    public Boolean updateQuestion(Question question) {
        return questionMapper.updateQuestion(question);
    }

    @Override
    public Boolean deleteQuestion(String chapAndNum) {
        return questionMapper.deleteQuestion(chapAndNum);
    }
}
