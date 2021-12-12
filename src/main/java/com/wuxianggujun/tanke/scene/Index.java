package com.wuxianggujun.tanke.scene;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class Index {
    public static void load(Stage stage) {
        try {
            Parent parent = FXMLLoader.load(Index.class.getResource(""));
            stage.getScene().setRoot(parent);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
