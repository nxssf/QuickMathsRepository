package com.example.quickmaths;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.quickmaths.Entities.QuestionPackage;
import com.example.quickmaths.Entities.QuestionService;
import com.example.quickmaths.Entities.QuestionDBResponse;
import com.example.quickmaths.Entities.QuestionService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.quickmaths.R.id.question;

public class QuizActivity extends AppCompatActivity {

    TextView questionNo;
    TextView instruction;
    MathView question;
    Button option1;
    Button option2;
    Button option3;
    Button option4;
    Button next;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        questionNo = findViewById(R.id.questionNo);
        questionNo.setText("Question 1");

        next = findViewById(R.id.next);
        next.setText("Next");

        instruction = findViewById(R.id.instruction);
        instruction.setText("Solve for x.");

        question = findViewById(R.id.question);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);

        requestQuestion();

    }

    public void updateQuestion(View view) {
        requestQuestion();
    }

    public void requestQuestion() {
        Gson gson = new GsonBuilder().create();

        QuestionService service = new Retrofit.Builder().baseUrl("https://math.ly/api/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
                .create(QuestionService.class);

        Call<QuestionDBResponse> questionCall = service.getQuestion();

        questionCall.enqueue(new Callback<QuestionDBResponse>() {
            @Override
            public void onResponse(Call<QuestionDBResponse> call, Response<QuestionDBResponse> response) {

                QuestionDBResponse questionDBResponse = response.body();
                QuestionPackage questionPackage = questionDBResponse.getQuestionPackage();

                if(questionPackage != null) {
                    instruction.setText(questionPackage.getInstruction());
                }

            }

            @Override
            public void onFailure(Call<QuestionDBResponse> call, Throwable t) {

            }
        });

    }
}
