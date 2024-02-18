package com.example.mirari;

import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.beans.property.SimpleStringProperty;

import java.io.IOException;

public class ChatController {
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    private String uInput = "";

    //brings user back to home screen
    public void switchToHome(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //Not detecting input properly
    //Was meant to detect user input for AI chatbot
    @FXML
    public void setUInput(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("chat-view.fxml"));
        Parent parent = (Parent)root.lookup("AnchorPane"); // the Parent (or Scene) that contains the TextAreas
        TextArea ta = (TextArea)parent.lookup("#textInput");
        if (ta != null) {
            uInput = ta.getText();
            if (uInput.isEmpty()) {
                System.out.println("No text entered.");
            } else {
                System.out.println("User input: " + uInput);
            }
        }
    }
}
