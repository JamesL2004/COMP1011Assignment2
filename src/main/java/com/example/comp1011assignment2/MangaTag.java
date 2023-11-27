package com.example.comp1011assignment2;

import java.util.List;

public class MangaTag {
    private String id;
    private String type;

    private MangaTagAttributes attributes;

    private List<MangaTagRelationships> relationships;

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public MangaTagAttributes getAttributes() {
        return attributes;
    }

    public List<MangaTagRelationships> getRelationships() {
        return relationships;
    }
}
