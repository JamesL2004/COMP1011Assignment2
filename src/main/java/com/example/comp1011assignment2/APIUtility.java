package com.example.comp1011assignment2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

public class APIUtility {

    public static void callAPI(String mangaTitle) throws IOException, InterruptedException {
        mangaTitle = mangaTitle.replaceAll(" ", "%20");

        String uri = "https://api.mangadex.org/manga?limit=10&title=" + mangaTitle;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();

        HttpResponse<Path> httpResponse = client.send(httpRequest, HttpResponse
                .BodyHandlers
                .ofFile(Paths.get("mangas.json")));
    }
}
