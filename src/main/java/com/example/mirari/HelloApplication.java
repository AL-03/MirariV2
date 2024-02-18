package com.example.mirari;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

//homepage
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene home = new Scene(root, 320, 240);
        stage.setScene(home);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}