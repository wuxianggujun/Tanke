package com.wuxianggujun.tanke;

import com.wuxianggujun.tanke.controller.IndexController;
import com.wuxianggujun.tanke.scene.Index;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Objects;

public class Director {
    public static final double WIDTH = 960;
    public static final double HEIGHT = 640;

    private static Director instance = new Director();
    private Stage stage;

    private Director() {

    }

    public static Director getInstance() {
        return instance;
    }

    public void init(Stage stage) {
        AnchorPane anchorPane = new AnchorPane();
        Scene scene = new Scene(anchorPane, WIDTH, HEIGHT);
        stage.setTitle("坦克");
        stage.getIcons().add(new Image(this.getClass().getResource("/image/logo.png").toExternalForm()));
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setWidth(WIDTH);
        stage.setHeight(HEIGHT);
        this.stage = stage;
        toIndex();
        stage.show();

    }

    public void toIndex(){
        Index.load(stage);

    }

    public void  gameStart(){


    }

    public void gameOver(){

    }


}
