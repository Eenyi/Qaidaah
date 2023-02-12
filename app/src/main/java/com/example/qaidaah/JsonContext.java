package com.example.qaidaah;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class JsonContext {
    public List<QuranContent> getDataFromJsonFile(InputStream is) {
        try {
            List<QuranContent> quranContents = new ArrayList<QuranContent>();
            QuranContent quranContent = new QuranContent();
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            String json = new String(buffer, "UTF-8");
            JSONArray jsonArray = new JSONArray(json);
            for (int i = jsonArray.length() - 1; i >= 0 ; i--) {
                JSONObject obj = jsonArray.getJSONObject(i);
                // access properties of JSONObject here
                quranContent.number = obj.getInt("number");
                quranContent.text = obj.getString("text");
                quranContent.numberInSurah = obj.getInt("numberInSurah");
                quranContent.juz = obj.getInt("juz");
                quranContent.manzil = obj.getInt("manzil");
                quranContent.page = obj.getInt("page");
                quranContent.ruku = obj.getInt("ruku");
                quranContent.hizbQuarter = obj.getInt("hizbQuarter");
                quranContent.surah_number = obj.getInt("surah_number");
                quranContent.surah_name = obj.getString("surah_name");
                quranContent.englishName = obj.getString("englishName");
                quranContent.englishName = obj.getString("englishName");
                quranContent.englishNameTranslation = obj.getString("englishNameTranslation");
                quranContent.revelationType = obj.getString("revelationType");
                quranContent.UrduTranslation = obj.getString("UrduTranslation");
                quranContent.UrduTafseer = obj.getString("UrduTafseer");
                quranContent.EnglishTranslation = obj.getString("EnglishTranslation");
                quranContent.Englishtafseer = obj.getString("Englishtafseer");
                quranContent.SindhiTranslation = obj.getString("SindhiTranslation");
                quranContent.SindhiTafseer = obj.getString("SindhiTafseer");
                quranContent.HindiTranslation = obj.getString("HindiTranslation");
                quranContent.HindiTafseer = obj.getString("HindiTafseer");
                quranContent.PushtoTransation = obj.getString("PushtoTransation");
                quranContents.add(quranContent);
            }
            return quranContents;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
