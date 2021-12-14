package com.wuxianggujun.tanke.scene;

import com.wuxianggujun.tanke.Director;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class GameScene {
    private Canvas canvas = new Canvas(Director.WIDTH, Director.HEIGHT);
    private GraphicsContext graphicsContext = canvas.getGraphicsContext2D();

    private KeyProcess keyProcess = new KeyProcess();
    private Refresh refresh = new Refresh();
    private boolean running = false;

    private void paint() {

    }

    public void init(Stage stage) {
        AnchorPane root = new AnchorPane(canvas);
        stage.getScene().setRoot(root);
        stage.getScene().setOnKeyPressed(keyProcess);
        refresh.start();

    }

    public void clean(Stage stage) {
        stage.getScene().removeEventHandler(KeyEvent.KEY_RELEASED, keyProcess);
        refresh.stop();
    }

    private class Refresh extends AnimationTimer {

        @Override
        public void handle(long l) {
            if (running) {
                paint();
            }
        }
    }

    private class KeyProcess implements EventHandler<KeyEvent> {

        @Override
        public void handle(KeyEvent keyEvent) {
            KeyCode keyCode = keyEvent.getCode();
            if (keyCode.equals(KeyCode.SPACE)) {
                pauseOrContinue();
            }
        }
    }

    public void pauseOrContinue() {
        if (running) {
            running = false;
        } else {
            running = true;
        }

    }

}
