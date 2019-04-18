package com.example.quickmaths.Entities;

import retrofit2.Call;
import retrofit2.http.GET;

public interface QuestionService {
    @GET("v1/algebra/linear-equations.json?difficulty=beginner")
    Call<QuestionDBResponse> getQuestion();
}
