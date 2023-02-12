package com.example.qaidaah;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton surah, parah;
    TextView heading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        surah = findViewById(R.id.surah);
        surah.setOnClickListener(this);
        parah = findViewById(R.id.parah);
        parah.setOnClickListener(this);
        heading = findViewById(R.id.heading);
        heading.setText("Parah");
        parah.setBackground(getDrawable(R.drawable.color_peach));
        parah.setImageResource(R.drawable.surah_active);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.surah:
                heading.setText("Surah");
                surah.setBackground(getDrawable(R.drawable.color_peach));
                surah.setImageResource(R.drawable.parah_active);
                parah.setBackground(getDrawable(R.drawable.peach_n));
                parah.setImageResource(R.drawable.surah_n);
                break;
            case R.id.parah:
                heading.setText("Parah");
                parah.setBackground(getDrawable(R.drawable.color_peach));
                parah.setImageResource(R.drawable.surah_active);
                surah.setBackground(getDrawable(R.drawable.peach_n));
                surah.setImageResource(R.drawable.parah_n);
                break;
        }
    }
}