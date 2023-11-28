package com.example.comp1011assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class MangaDetailsController implements LoadManga{

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private Label lastChapterLabel;

    @FXML
    private Label lastVolumeLabel;

    @FXML
    private Label statusLabel;

    @FXML
    private Label titleLabel;

    @FXML
    private Label typeLabel;

    @FXML
    private Label yearLabel;

    @FXML
    void backToSearch(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "SearchMangaView.fxml");

    }
    public void loadMangaDetails(String id) throws IOException, InterruptedException {
        MangaResponse mangaResponse = APIUtility.getMangaDetails(id);
        titleLabel.setText(mangaResponse.getData().getAttributes().getTitle().getEn());
        descriptionTextArea.setText(mangaResponse.getData().getAttributes().getDescription().getEn());
        typeLabel.setText(mangaResponse.getData().getType());
        if(mangaResponse.getData().getAttributes().getLastVolume().isEmpty()){
            lastVolumeLabel.setText("No volume number provided.");
        }
        else{
            lastVolumeLabel.setText(mangaResponse.getData().getAttributes().getLastVolume());
        }
        if(mangaResponse.getData().getAttributes().getLastChapter().isEmpty()){
            lastChapterLabel.setText("No chapter number provided.");
        }
        else{
            lastChapterLabel.setText(mangaResponse.getData().getAttributes().getLastChapter());
        }
        statusLabel.setText(mangaResponse.getData().getAttributes().getStatus());
        if(mangaResponse.getData().getAttributes().getYear().equals("0")){
            yearLabel.setText("No Year Provided");
        }
        else{
            yearLabel.setText(mangaResponse.getData().getAttributes().getYear());
        }


    }

}

