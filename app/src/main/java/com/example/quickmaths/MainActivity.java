package com.example.quickmaths;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*This is the screen users are initially presented with.
It contains 2 buttons: 'Start' and 'Additional Resources'.
The 'Start' button will bring users to ChoiceActivity.*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startButton = findViewById(R.id.start);
        Button additionalResourcesButton = findViewById(R.id.additionalResources);



    }
}
