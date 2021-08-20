package com.lyingflat.sdd.supremegrader.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class Teacher extends Person {
    private int teacherID;                       // teacher ID
    private List<Subject> teachingSubject;       // all the subject this teacher is teaching 

    public abstract void addSubject(Subject subject);

    public abstract void dropSubject(int index);


}
