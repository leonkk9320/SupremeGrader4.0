package com.lyingflat.sdd.supremegrader.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class Student extends Person {
    private int studentID;                     // student ID
    private Grade grade;                       // Grade
    private List<String> learningSubject;      // the courses that this student is taking
    private Map<String, String> announcements; // record announcement


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return studentID == student.studentID && Objects.equals(grade, student.grade) && Objects.equals(learningSubject, student.learningSubject) && Objects.equals(announcements, student.announcements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentID, grade, learningSubject, announcements);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", grade=" + grade +
                ", learningSubject=" + learningSubject +
                ", announcements=" + announcements +
                '}';
    }

    //Convert all the announcements to a format of String
    public String AnnouncementString(){
        String ret = "";
        for (String key : announcements.keySet()){
            ret+= "Time: "+ key +" Text"+announcements.get(key)+"\n";
        }
        return ret;
    }

    public abstract void addSubject(String name);

    public abstract void dropSubject(String name);

    //grade related methods

    public abstract double queryAvg();

    public abstract Integer queryScoreByExam(String examName);

    public abstract Integer addEntry(String name, Integer score);

    public abstract Integer deleteEntry(String name);

    public abstract void modifyEntry(String examName, Integer score);

    public abstract void emptyAll();


}
