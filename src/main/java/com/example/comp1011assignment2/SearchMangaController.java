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
    @FXML
    void getDetails(ActionEvent event) {

    }

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
