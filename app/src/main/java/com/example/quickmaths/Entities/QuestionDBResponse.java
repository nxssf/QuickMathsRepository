package com.example.quickmaths.Entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuestionDBResponse {

    @SerializedName("questionPackage")
    @Expose
    private QuestionPackage questionPackage;

    public QuestionPackage getQuestionPackage() {
        return questionPackage;
    }

    public void setQuestionPackage (QuestionPackage questionPackage) {
        this.questionPackage = questionPackage;
    }
}
