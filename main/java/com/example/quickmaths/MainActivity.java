package com.example.quickmaths;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/*This is the screen users are initially presented with.
It contains 2 buttons: 'Start' and 'Additional Resources'.
The 'Start' button will bring users to ChoiceActivity.*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView play = findViewById(R.id.play);


        play.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ChoiceActivity.class));
            }
        });

    }
}
