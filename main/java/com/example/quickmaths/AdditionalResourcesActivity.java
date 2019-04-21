package com.example.quickmaths;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.quickmaths.Notes.AdditionalRes_Adapter;
import com.example.quickmaths.Notes.DetailAddResource;
import com.example.quickmaths.Notes.Resources;

public class AdditionalResourcesActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager linearLayout;

    public static final String EXTRA_MESSAGE = "au.edu.unsw.infs3634.quickmaths.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additional_resources);

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);

        //set linear layout
        linearLayout = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayout);

        AdditionalRes_Adapter.RecyclerViewListener lisiten = new AdditionalRes_Adapter.RecyclerViewListener() {
            @Override
            public void onClick(View v, int position) {
                launchDetail(position);
            }
        };

        //set adapter
        adapter = new AdditionalRes_Adapter(Resources.getResource(),lisiten);
        recyclerView.setAdapter(adapter);

    }

    public void launchDetail (int position){
        Intent intent = new Intent(this, DetailAddResource.class);
        intent.putExtra(EXTRA_MESSAGE,position);
        startActivity(intent);
    }
}
