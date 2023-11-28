package com.example.comp1011assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class SearchMangaController
{

    @FXML
    private ListView<MangaData> listView;

    @FXML
    private TextField searchTextField;

    @FXML
    private VBox secondVbox;
    @FXML
    private void initialize()
    {
        secondVbox.setVisible(false);
    }
    /* Creates a new MangaData object and then gets the id and transfers it to manga-details scene
    *
    * @param mangaChoice
    * @param SceneChanger
    *
    * */
    @FXML
    void getDetails(ActionEvent event) throws IOException, InterruptedException {
        MangaData mangaChoice = listView.getSelectionModel().getSelectedItem();
        if(mangaChoice == null){
            throw new IllegalArgumentException("You must choose a manga.");
        }
        else{
            SceneChanger.changeScenes(event, "manga-details-view.fxml", mangaChoice.getId());
        }

    }
    /*
    * When the search button is pressed it will load a List of mangaData objects
    * @param title
    * @param apiResponse
    * @param List of mangaData objects
    * */
    @FXML
    void search(ActionEvent event) throws IOException, InterruptedException {
        listView.getItems().clear();
        String mangaTitle = searchTextField.getText().trim();
        APIResponse apiResponse = APIUtility.callAPI(mangaTitle);
        if(apiResponse.getData().size() > 0){
            secondVbox.setVisible(true);
            listView.getItems().addAll(apiResponse.getData());
        }

    }

}
