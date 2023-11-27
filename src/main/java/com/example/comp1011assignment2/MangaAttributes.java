package com.example.comp1011assignment2;

import java.util.ArrayList;

public class MangaAttributes {
    private ArrayList<MangaTitle> title;
    private ArrayList<MangaDescription> description;
    private String lastVolume;
    private String lastChapter;
    private String publicationDemographic;
    private String status;
    private int year;

    public ArrayList<MangaTitle> getTitle() {
        return title;
    }

    public ArrayList<MangaDescription> getDescription() {
        return description;
    }

    public String getLastVolume() {
        return lastVolume;
    }

    public String getLastChapter() {
        return lastChapter;
    }

    public String getPublicationDemographic() {
        return publicationDemographic;
    }

    public String getStatus() {
        return status;
    }

    public int getYear() {
        return year;
    }
}
