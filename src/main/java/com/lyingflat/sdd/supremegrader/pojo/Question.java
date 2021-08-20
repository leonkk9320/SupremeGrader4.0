package com.lyingflat.sdd.supremegrader.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Question {
    private String questionUuid;     //uuid
    private String chapAndNum;       
    private String description;      //description of the question
    private Options answer;          //answer for the question
    private String optionA;          //content for  optionA
    private String optionB;          //content for  optionB
    private String optionC;          //content for  optionC
    private String optionD;          //content for  optionD

    public String getQuestionUuid() {
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return Objects.equals(questionUuid, question.questionUuid) && Objects.equals(description, question.description) && answer == question.answer && Objects.equals(optionA, question.optionA) && Objects.equals(optionB, question.optionB) && Objects.equals(optionC, question.optionC) && Objects.equals(optionD, question.optionD);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionUuid, description, answer, optionA, optionB, optionC, optionD);
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionUuid='" + questionUuid + '\'' +
                ", description='" + description + '\'' +
                ", answer=" + answer +
                ", optionA='" + optionA + '\'' +
                ", optionB='" + optionB + '\'' +
                ", optionC='" + optionC + '\'' +
                ", optionD='" + optionD + '\'' +
                '}';
    }
}
