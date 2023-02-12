package com.example.qaidaah;

public class QuranContent {
    Integer number = 0;
    String text = "";
    Integer numberInSurah = 0;
    Integer juz = 0;
    Integer manzil = 0;
    Integer page = 0;
    Integer ruku = 0;
    Integer hizbQuarter = 0;
    Integer surah_number = 0;
    String surah_name = "";
    String englishName = "";
    String englishNameTranslation = "";
    String revelationType = "";
    String UrduTranslation = "";
    String UrduTafseer = "";
    String EnglishTranslation = "";
    String Englishtafseer = "";
    String SindhiTranslation = "";
    String SindhiTafseer = "";
    String HindiTranslation = "";
    String HindiTafseer = "";
    String PushtoTransation = "";

    public QuranContent() {

    }

    public QuranContent(Integer number, String text, Integer numberInSurah, Integer juz, Integer manzil, Integer page, Integer ruku, Integer hizbQuarter, Integer surah_number, String surah_name, String englishName, String englishNameTranslation, String revelationType, String urduTranslation, String urduTafseer, String englishTranslation, String englishtafseer, String sindhiTranslation, String sindhiTafseer, String hindiTranslation, String hindiTafseer, String pushtoTransation, String pushtoTafseer) {
        this.number = number;
        this.text = text;
        this.numberInSurah = numberInSurah;
        this.juz = juz;
        this.manzil = manzil;
        this.page = page;
        this.ruku = ruku;
        this.hizbQuarter = hizbQuarter;
        this.surah_number = surah_number;
        this.surah_name = surah_name;
        this.englishName = englishName;
        this.englishNameTranslation = englishNameTranslation;
        this.revelationType = revelationType;
        UrduTranslation = urduTranslation;
        UrduTafseer = urduTafseer;
        EnglishTranslation = englishTranslation;
        Englishtafseer = englishtafseer;
        SindhiTranslation = sindhiTranslation;
        SindhiTafseer = sindhiTafseer;
        HindiTranslation = hindiTranslation;
        HindiTafseer = hindiTafseer;
        PushtoTransation = pushtoTransation;
        PushtoTafseer = pushtoTafseer;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getNumberInSurah() {
        return numberInSurah;
    }

    public void setNumberInSurah(Integer numberInSurah) {
        this.numberInSurah = numberInSurah;
    }

    public Integer getJuz() {
        return juz;
    }

    public void setJuz(Integer juz) {
        this.juz = juz;
    }

    public Integer getManzil() {
        return manzil;
    }

    public void setManzil(Integer manzil) {
        this.manzil = manzil;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRuku() {
        return ruku;
    }

    public void setRuku(Integer ruku) {
        this.ruku = ruku;
    }

    public Integer getHizbQuarter() {
        return hizbQuarter;
    }

    public void setHizbQuarter(Integer hizbQuarter) {
        this.hizbQuarter = hizbQuarter;
    }

    public Integer getSurah_number() {
        return surah_number;
    }

    public void setSurah_number(Integer surah_number) {
        this.surah_number = surah_number;
    }

    public String getSurah_name() {
        return surah_name;
    }

    public void setSurah_name(String surah_name) {
        this.surah_name = surah_name;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getEnglishNameTranslation() {
        return englishNameTranslation;
    }

    public void setEnglishNameTranslation(String englishNameTranslation) {
        this.englishNameTranslation = englishNameTranslation;
    }

    public String getRevelationType() {
        return revelationType;
    }

    public void setRevelationType(String revelationType) {
        this.revelationType = revelationType;
    }

    public String getUrduTranslation() {
        return UrduTranslation;
    }

    public void setUrduTranslation(String urduTranslation) {
        UrduTranslation = urduTranslation;
    }

    public String getUrduTafseer() {
        return UrduTafseer;
    }

    public void setUrduTafseer(String urduTafseer) {
        UrduTafseer = urduTafseer;
    }

    public String getEnglishTranslation() {
        return EnglishTranslation;
    }

    public void setEnglishTranslation(String englishTranslation) {
        EnglishTranslation = englishTranslation;
    }

    public String getEnglishtafseer() {
        return Englishtafseer;
    }

    public void setEnglishtafseer(String englishtafseer) {
        Englishtafseer = englishtafseer;
    }

    public String getSindhiTranslation() {
        return SindhiTranslation;
    }

    public void setSindhiTranslation(String sindhiTranslation) {
        SindhiTranslation = sindhiTranslation;
    }

    public String getSindhiTafseer() {
        return SindhiTafseer;
    }

    public void setSindhiTafseer(String sindhiTafseer) {
        SindhiTafseer = sindhiTafseer;
    }

    public String getHindiTranslation() {
        return HindiTranslation;
    }

    public void setHindiTranslation(String hindiTranslation) {
        HindiTranslation = hindiTranslation;
    }

    public String getHindiTafseer() {
        return HindiTafseer;
    }

    public void setHindiTafseer(String hindiTafseer) {
        HindiTafseer = hindiTafseer;
    }

    public String getPushtoTransation() {
        return PushtoTransation;
    }

    public void setPushtoTransation(String pushtoTransation) {
        PushtoTransation = pushtoTransation;
    }

    public String getPushtoTafseer() {
        return PushtoTafseer;
    }

    public void setPushtoTafseer(String pushtoTafseer) {
        PushtoTafseer = pushtoTafseer;
    }

    String PushtoTafseer = "";

    public String translation(String key) {
        if (key.equals("EnglishTranslation")) {
            return getEnglishTranslation();
        }
        if (key.equals("UrduTranslation")) {
            return getUrduTranslation();
        }
        if (key.equals("SindhiTranslation")) {
            return getSindhiTranslation();
        }
        if (key.equals("HindiTranslation")) {
            return getHindiTranslation();
        }
        if (key.equals("PushtoTransation")) {
            return getPushtoTransation();
        }
        return "";
    }
}