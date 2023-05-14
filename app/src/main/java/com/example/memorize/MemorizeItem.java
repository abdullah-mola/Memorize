package com.example.memorize;

import java.util.Date;

public class MemorizeItem {
    private String textLanguage1;
    private String textLanguage2;
    private String germanPronunciation;
    private Date date;

    public MemorizeItem(String textLanguage1, String textLanguage2, String germanPronunciation, Date date) {
        this.textLanguage1 = textLanguage1;
        this.textLanguage2 = textLanguage2;
        this.germanPronunciation = germanPronunciation;
        this.date = date;
    }

    public String getTextLanguage1() {
        return textLanguage1;
    }

    public void setTextLanguage1(String textLanguage1) {
        this.textLanguage1 = textLanguage1;
    }

    public String getTextLanguage2() {
        return textLanguage2;
    }

    public void setTextLanguage2(String textLanguage2) {
        this.textLanguage2 = textLanguage2;
    }

    public String getGermanPronunciation() {
        return germanPronunciation;
    }

    public void setGermanPronunciation(String germanPronunciation) {
        this.germanPronunciation = germanPronunciation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
