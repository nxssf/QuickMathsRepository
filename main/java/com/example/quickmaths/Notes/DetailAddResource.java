package com.example.quickmaths.Notes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import static com.example.quickmaths.AdditionalResourcesActivity.EXTRA_MESSAGE;

import com.example.quickmaths.R;

public class DetailAddResource extends AppCompatActivity {

    private Resources resource;

    //Implement webview
    protected void onCreate (Bundle savedInstanceStates){
        super.onCreate(savedInstanceStates);
        setContentView(R.layout.resource_detail);


        WebView webview = findViewById(R.id.web);
        //setContentView(webview);

        //Get intent that started the activity and extract the position number
        Intent intent = getIntent();
        int position = intent.getIntExtra(EXTRA_MESSAGE,0);

        resource = Resources.getResource().get(position);
        webview.loadUrl(resource.getWebsite());

    }

}
