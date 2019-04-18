package com.example.quickmaths;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.quickmaths.Entities.QuestionService;
import com.example.quickmaths.Entities.QuestionDBResponse;
import com.example.quickmaths.Entities.QuestionService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public void updateQuestion(View view) {
        requestQuestion();
    }

    public void requestQuestion() {

        Gson gson = new GsonBuilder().create();

        QuestionService service = new Retrofit.Builder().baseUrl("https://math.ly/api")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
                .create(QuestionService.class);

        // Call<QuestionDBResponse> call = service.getQuestion();

    }
}
