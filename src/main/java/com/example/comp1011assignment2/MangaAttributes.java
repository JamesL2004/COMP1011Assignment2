package com.example.comp1011assignment2;

import java.util.List;

public class MangaAttributes {
    private MangaTitle title;
    private List<MangaAltTitle> altTitles;
    private MangaDescription description;
    private boolean isLocked;
    private MangaLinks links;
    private String originalLanguage;
    private String lastVolume;
    private String lastChapter;
    private String publicationDemographic;
    private String status;
    private int year;
    private String contentRating;
    private List<MangaTag> tags;
    private String state;
    private boolean chapterNumbersResetOnNewVolume;
    private String createdAt;
    private String updatedAt;
    private int version;
    private List<String> availableTranslatedLanguages;
    private String latestUploadedChapter;

    public MangaTitle getTitle() {
        return title;
    }

    public List<MangaAltTitle> getAltTitles() {
        return altTitles;
    }

    public MangaDescription getDescription() {
        return description;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public MangaLinks getLinks() {
        return links;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
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

    public String getYear() {
        return String.valueOf(year);
    }

    public String getContentRating() {
        return contentRating;
    }

    public List<MangaTag> getTags() {
        return tags;
    }

    public String getState() {
        return state;
    }

    public boolean isChapterNumbersResetOnNewVolume() {
        return chapterNumbersResetOnNewVolume;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public int getVersion() {
        return version;
    }

    public List<String> getAvailableTranslatedLanguages() {
        return availableTranslatedLanguages;
    }

    public String getLatestUploadedChapter() {
        return latestUploadedChapter;
    }
}
