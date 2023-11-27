package com.example.comp1011assignment2;

import java.util.ArrayList;

public class APIResponse {
    private String result;
    private String response;
    private int limit;
    private int offset;
    private int total;
    private ArrayList<MangaData> data;

    public String getResult() {
        return result;
    }

    public String getResponse() {
        return response;
    }

    public int getLimit() {
        return limit;
    }

    public int getOffset() {
        return offset;
    }

    public int getTotal() {
        return total;
    }

    public ArrayList<MangaData> getData() {
        return data;
    }
}
