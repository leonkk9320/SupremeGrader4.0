package com.lyingflat.sdd.supremegrader.dao.impl;

import com.lyingflat.sdd.supremegrader.pojo.Question;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;


/**
 * implementation file of QuestionMapper
 */

public class QuestionMapperImpl{

    /**
     * implementation of listAllQuestions
     * @return a String of sql code
     */
    public String listAllQuestions() {
        return new SQL(){{
            SELECT("*");
            FROM("question");
        }}.toString();
    }

    /**
     * implementation of listQuestion
     * @return a String of sql code
     */
    public String listQuestion(Map<String,Object> param) {
        return new SQL(){{
            SELECT("*");
            FROM("question");
            WHERE("chapAndNum = " + "'" + param.get("chapAndNum") + "'");
        }}.toString();
    }

    /**
     * implementation of insertQuestion
     * @return a String of sql code
     */
    public String insertQuestion(Map<String,Object> param) {
        return new SQL() {{
            INSERT_INTO("question");
            VALUES("questionUuid", "'"+((Question) param.get("question")).getQuestionUuid()+"'");
            if(((Question) param.get("question")).getChapAndNum() != null)
                VALUES("chapAndNum",  "'" + ((Question) param.get("question")).getChapAndNum()+"'");
            if(((Question) param.get("question")).getDescription() != null)
                VALUES("description",  "'" + ((Question) param.get("question")).getDescription()+"'");
            if(((Question) param.get("question")).getAnswer() != null)
                VALUES("answer",  "'" + ((Question) param.get("question")).getAnswer()+"'");
            if(((Question) param.get("question")).getOptionA() != null)
                VALUES("optionA",  "'" + ((Question) param.get("question")).getOptionA()+"'");
            if(((Question) param.get("question")).getOptionB() != null)
                VALUES("optionB",  "'" + ((Question) param.get("question")).getOptionB()+"'");
            if(((Question) param.get("question")).getOptionC() != null)
                VALUES("optionC",  "'" + ((Question) param.get("question")).getOptionC()+"'");
            if(((Question) param.get("question")).getOptionD() != null)
                VALUES("optionD",  "'" + ((Question) param.get("question")).getOptionD()+"'");
        }}.toString();
    }

    /**
     * implementation of updateQuestion
     * @return a String of sql code
     */
    public String updateQuestion(Map<String,Object> param) {
        return new SQL(){{
            UPDATE("question");
            if(((Question) param.get("question")).getDescription() != null)
                SET("description = " + "'" + ((Question) param.get("question")).getDescription()+"'");
            if(((Question) param.get("question")).getAnswer() != null)
                SET("answer = " + "'" + ((Question) param.get("question")).getAnswer()+"'");
            if(((Question) param.get("question")).getOptionA() != null)
                SET("optionA = " + "'" + ((Question) param.get("question")).getOptionA()+"'");
            if(((Question) param.get("question")).getOptionB() != null)
                SET("optionB = " + "'" + ((Question) param.get("question")).getOptionB()+"'");
            if(((Question) param.get("question")).getOptionC() != null)
                SET("optionC = " + "'" + ((Question) param.get("question")).getOptionC()+"'");
            if(((Question) param.get("question")).getOptionD() != null)
                SET("optionD = " + "'" + ((Question) param.get("question")).getOptionD()+"'");
            WHERE("chapAndNum =" + "'" + ((Question) param.get("question")).getChapAndNum()+"'");
        }}.toString();
    }


    /**
     * implementation of deleteQuestion
     * @return a String of sql code
     */
    public String deleteQuestion(Map<String, Object> param) {
        return new SQL(){{
            DELETE_FROM("question");
            WHERE("chapAndNum = " + "'" + param.get("chapAndNum") + "'");
        }}.toString();
    }
}
