package com.example.quickmaths;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TopicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);

        Button simpleArithmetic = findViewById(R.id.simpleArithmetic);
        Button fractionArithmetic = findViewById(R.id.fractionArithmetic);
        Button linearEquations = findViewById(R.id.linearEquations);

        /* All buttons currently link to the same Quiz activity */
        simpleArithmetic.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(TopicActivity.this, QuizActivity.class));
            }
        });

        fractionArithmetic.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(TopicActivity.this, QuizActivity.class));
            }
        });

        linearEquations.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(TopicActivity.this, QuizActivity.class));
            }
        });
    }
}
