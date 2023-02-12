package com.example.qaidaah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class OutputView extends AppCompatActivity {
    List<ayatView> currentRecords;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    JsonContext jsonContext;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output_view);
        intent = getIntent();
        jsonContext = new JsonContext();
        currentRecords = new ArrayList<>();
        try {
            currentRecords = jsonContext.getParahContent(intent.getStringExtra("name"),
                    intent.getStringExtra("number"),
                    intent.getStringExtra("key"),
                    getAssets().open("data.txt"));
            recyclerView = findViewById(R.id.quran);
            recyclerView.setHasFixedSize(true);
            layoutManager = new LinearLayoutManager(OutputView.this);
            recyclerView.setLayoutManager(layoutManager);
            adapter = new myRecyclerViewAdapter(currentRecords) ;
            recyclerView.setAdapter(adapter);
        } catch (Exception e) {
            e.printStackTrace();
            Log.d("eror", e.getMessage());
        }

    }
}