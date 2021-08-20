package com.lyingflat.sdd.supremegrader.pojo.impl;

import com.lyingflat.sdd.supremegrader.pojo.Subject;
import com.lyingflat.sdd.supremegrader.pojo.Teacher;

import java.util.List;

public class TeacherImpl extends Teacher {
    private List<Subject> teachingSubject = super.getTeachingSubject();

    @Override
    public void addSubject(Subject subject) {
        teachingSubject.add(subject);
    }

    @Override
    public void dropSubject(int index) {
        teachingSubject.remove(index);
    }

    @Override
    public void printInfo(String name, String email, String department, String ID, String s) {
        super.printInfo(name, email, department, ID, s);
        System.out.println("Teacher ID: " + ID);
        System.out.println("Degree: " + s);
    }
}
