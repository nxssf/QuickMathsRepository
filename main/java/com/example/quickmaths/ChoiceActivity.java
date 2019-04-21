package com.example.quickmaths;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class ChoiceActivity extends AppCompatActivity {


    //Choose to either practise or quiz
    //Whatever they pick goes to TopicActivity to choose the topic

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        ImageView iPractise = findViewById(R.id.practise);
        ImageView iQuiz = findViewById(R.id.quiz);
        ImageView iMore = findViewById(R.id.more);
        ImageView iNotes = findViewById(R.id.notes);


        /*For now, the practiseButton will also direct the user to the Topic Activity*/
        iPractise.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChoiceActivity.this, TopicActivity.class));
            }
        });

        iQuiz.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChoiceActivity.this, TopicActivity.class));
            }
        });

        iMore.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChoiceActivity.this, AdditionalResourcesActivity.class));
            }
        });

        iNotes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChoiceActivity.this, TopicActivity.class));
            }
        });
    }
}
