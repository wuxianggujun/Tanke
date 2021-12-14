package com.wuxianggujun.tanke.controller;

import com.wuxianggujun.tanke.Director;
import com.wuxianggujun.tanke.sound.SoundEffect;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class IndexController {

    @FXML
    private ImageView startGame;

    @FXML
    void mouseClickedStartGame(MouseEvent event) {
        SoundEffect.play("/sound/done.wav");
        Director.getInstance().gameStart();
    }

    @FXML
    void mouseEnteredStartGame(MouseEvent event) {
        startGame.setOpacity(0.8);
        System.out.println("鼠标滑过");
        SoundEffect.play("/sound/button.wav");
    }

    @FXML
    void mouseExitedStartGame(MouseEvent event) {
        startGame.setOpacity(1);
    }

}
