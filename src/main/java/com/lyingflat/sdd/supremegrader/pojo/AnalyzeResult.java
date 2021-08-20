package com.lyingflat.sdd.supremegrader.pojo;


// AnalyzeResult

public class AnalyzeResult {
    private Student student; // Student class
    private int studentId;	// Student ID
    private int sumScore;	// Total Grade
    private double avgScore;	// Average Grade

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = this.student.getStudentID();
    }

    public int getSumScore() {
        return sumScore;
    }

    // Go through student Grade and calculate the sum of the scores
    public void setSumScore() {
        Grade grade = student.getGrade();
        int sum = 0;
        for (int score: grade.examsScore.values()){
            sum+=score;
        }
        this.sumScore = sum;
    }
    public double getAvgScore() {
        return avgScore;
    }

    // Go through student Grade and calculate the average of the scores
    public void setAvgScore() {
        Grade grade = student.getGrade();
        int sum = 0;
        int counter = 0;
        for (int score: grade.examsScore.values()){
            sum+=score;
            counter++;
        }

        this.avgScore = sum/counter;

    }
}
