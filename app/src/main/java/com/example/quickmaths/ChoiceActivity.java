package com.example.quickmaths;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class ChoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        Button practiseButton = findViewById(R.id.practiseButton);
        Button quizButton = findViewById(R.id.quizButton);

        /*For now, the practiseButton will also direct the user to the Topic Activity*/
        practiseButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChoiceActivity.this, TopicActivity.class));
            }
        });

        quizButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChoiceActivity.this, TopicActivity.class));
            }
        });
    }
}
