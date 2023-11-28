package com.example.comp1011assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class MangaDetailsController {

    @FXML
    private Label descriptionLabel;

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
    public void loadMangaDetails(String id){

    }

}

