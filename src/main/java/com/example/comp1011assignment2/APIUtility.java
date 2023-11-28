package com.example.comp1011assignment2;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIUtility {

    public static APIResponse callAPI(String mangaTitle) throws IOException, InterruptedException {
        mangaTitle = mangaTitle.replaceAll(" ", "%20");

        String uri = "https://api.mangadex.org/manga?limit=20&title=" + mangaTitle;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();

        HttpResponse<String> response = client.send(httpRequest, HttpResponse
                .BodyHandlers.ofString());
        Gson gson = new Gson();
        return gson.fromJson(response.body(), APIResponse.class);
    }
    public static MangaResponse getMangaDetails(String id) throws IOException, InterruptedException {
        id = id.trim().replaceAll(" ","%20");

        String uri = "https://api.mangadex.org/manga/" + id;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();

        HttpResponse<String> response = client.send(httpRequest, HttpResponse
                .BodyHandlers.ofString());
        Gson gson = new Gson();
        return gson.fromJson(response.body(), MangaResponse.class);
    }
}
