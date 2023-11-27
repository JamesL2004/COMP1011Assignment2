package com.example.comp1011assignment2;

import java.util.ArrayList;
import java.util.List;

public class MangaData {
    private String id;
    private String type;
    private MangaAttributes attributes;
    private List<MangaRelationships> relationships;

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public MangaAttributes getAttributes() {
        return attributes;
    }

    public List<MangaRelationships> getRelationships() {
        return relationships;
    }
    public String toString()
    {
        if(getAttributes().getYear() != 0){
            return  String.format("%s - %s",getAttributes().getYear(),getAttributes().getTitle().getEn());
        }
        else{
            return "No Year Given - " + getAttributes().getTitle().getEn();
        }

    }
}
