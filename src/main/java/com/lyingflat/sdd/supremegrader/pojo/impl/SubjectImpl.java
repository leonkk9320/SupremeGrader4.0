package com.lyingflat.sdd.supremegrader.pojo.impl;

import com.lyingflat.sdd.supremegrader.pojo.Question;
import com.lyingflat.sdd.supremegrader.pojo.Subject;

import java.util.List;

public class SubjectImpl extends Subject {
    List<Question> questionList = super.getQuestionList();

    @Override
    public void addQuestion(Question question) {
        questionList.add(question);
    }

    @Override
    public void dropQuestion(int index) {
        questionList.remove(index);
    }
}
