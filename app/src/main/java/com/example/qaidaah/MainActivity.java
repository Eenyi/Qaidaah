package com.example.qaidaah;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton surah, parah;
    TextView heading;
    SurahFragment surahFragment;
    ParahFragment parahFragment;
    FragmentTransaction transaction;
    List<QuranContent> quranContents;
    JsonContext jsonContext;
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
        surahFragment = new SurahFragment();
        parahFragment = new ParahFragment();
        transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.menu, parahFragment);
        transaction.commit();
        jsonContext = new JsonContext();
        try {
            InputStream is = getAssets().open("data.txt");
            quranContents = jsonContext.getDataFromJsonFile(is);
            Log.d("wdwd", "adadadvewe");
        } catch (IOException e) {
            e.printStackTrace();
            Log.d("eeeee", e.getMessage());
        }

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
                transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.menu, surahFragment);
                transaction.commit();
                break;
            case R.id.parah:
                heading.setText("Parah");
                parah.setBackground(getDrawable(R.drawable.color_peach));
                parah.setImageResource(R.drawable.surah_active);
                surah.setBackground(getDrawable(R.drawable.peach_n));
                surah.setImageResource(R.drawable.parah_n);
                transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.menu, parahFragment);
                transaction.commit();
                break;
        }
    }
}