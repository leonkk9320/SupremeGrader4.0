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
public abstract class Subject {
    private int subjectID;                 // id
    private String subjectName;            // name
    private String info;                   // Information of the subject
    private List<Student> studentGroup;    // List of students that take this course
    private Teacher teacher;               // teacher who teaches this course
    private List<Question> questionList;   // question bank for this course

    public abstract void addQuestion(Question question);

    public abstract void dropQuestion(int index);
}
