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
}
