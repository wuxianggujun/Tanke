package com.wuxianggujun.tanke.scene;

import com.wuxianggujun.tanke.controller.IndexController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class Index {

    public static void load(Stage stage) {
        System.out.println(Index.class.getResource("/fxml/index.fxml").getFile());
        System.out.println(Index.class.getResource("/fxml/").getFile());

        try {
            Parent root = FXMLLoader.load(Index.class.getResource("/fxml/index.fxml"));
            stage.getScene().setRoot(root);
//            FXMLLoader fxmlLoader = new FXMLLoader(Index.class.getResource("/fxml/index.fxml"));
//            stage.getScene().setRoot(fxmlLoader.load());
//            IndexController indexController = fxmlLoader.getController();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
