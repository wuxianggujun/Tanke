package com.wuxianggujun.tanke;

import com.wuxianggujun.tanke.scene.Index;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
//         FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/fxml/index.fxml"));
//         Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//         stage.setTitle("Hello!");
//         stage.setScene(scene);
//         stage.show();
        Director.getInstance().init(stage);
//      Index.load(stage);
    }
}