package com.example.qaidaah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class Translation extends AppCompatActivity implements View.OnClickListener{
    TextView name, number;
    Intent intent;
    Button en, ur, sn, hn, pt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translation);
        name = findViewById(R.id.name);
        number = findViewById(R.id.number);
        intent = getIntent();
        name.setText(intent.getStringExtra("name"));
        number.setText(intent.getStringExtra("number"));
        en = findViewById(R.id.en);
        ur = findViewById(R.id.ur);
        sn = findViewById(R.id.sn);
        hn = findViewById(R.id.hn);
        pt = findViewById(R.id.pt);
        en.setOnClickListener(this);
        ur.setOnClickListener(this);
        sn.setOnClickListener(this);
        hn.setOnClickListener(this);
        pt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String key = "";
        Intent intent1 = new Intent(Translation.this, OutputView.class);
        intent1.putExtra("number", number.getText());
        intent1.putExtra("name", name.getText());
        switch (v.getId()) {
            case R.id.en:
                key = "EnglishTranslation";
                intent1.putExtra("key", key);
                startActivity(intent1);
                break;
            case R.id.ur:
                key = "UrduTranslation";
                intent1.putExtra("key", key);
                startActivity(intent1);
                break;
            case R.id.sn:
                key = "SindhiTranslation";
                intent1.putExtra("key", key);
                startActivity(intent1);
                break;
            case R.id.hn:
                key = "HindiTranslation";
                intent1.putExtra("key", key);
                startActivity(intent1);
                break;
            case R.id.pt:
                key = "PushtoTransation";
                intent1.putExtra("key", key);
                startActivity(intent1);
                break;
        }
    }
}