package com.example.quickmaths;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TopicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);

        ImageView simpleArithmetic = findViewById(R.id.SimpleA);
        ImageView fractionArithmetic = findViewById(R.id.FractioA);
        ImageView linearEquations = findViewById(R.id.LinearE);
        ImageView ret = findViewById(R.id.retT);

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

        ret.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(TopicActivity.this, ChoiceActivity.class));
            }
        });
    }
}
