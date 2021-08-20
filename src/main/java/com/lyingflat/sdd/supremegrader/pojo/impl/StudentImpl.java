package com.lyingflat.sdd.supremegrader.pojo.impl;

import com.lyingflat.sdd.supremegrader.pojo.Student;

import java.util.List;

public class StudentImpl extends Student {
    List<String> learningSubject = super.getLearningSubject();

    @Override
    public void addSubject(String name) {
        learningSubject.add(name);
    }

    @Override
    public void dropSubject(String name) {
        learningSubject.remove(name);
    }

    @Override
    public double queryAvg() {
        return super.getGrade().calculateAvg();
    }

    @Override
    public Integer queryScoreByExam(String examName) {
        return super.getGrade().getScore(examName);
    }

    @Override
    public Integer addEntry(String name, Integer score) {
        return super.getGrade().addEntry(name, score);
    }

    @Override
    public Integer deleteEntry(String name) {
        return super.getGrade().deleteEntry(name);
    }

    @Override
    public void modifyEntry(String examName, Integer score) {
        super.getGrade().modifyEntry(examName, score);
    }

    @Override
    public void emptyAll() {
        learningSubject = null;
    }

    @Override
    public void printInfo(String name, String email, String department, String ID, String s) {
        super.printInfo(name, email, department, ID, s);
        System.out.println("Student ID: " + ID);
        System.out.println("Major: " + s);
    }
}
