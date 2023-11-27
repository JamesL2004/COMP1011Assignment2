package com.example.comp1011assignment2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Search for Your Favourite Manga");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        try {
            APIResponse response = APIUtility.callAPI("Demon Slayer");
            System.out.println(response.getResponse());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //launch();
    }
}