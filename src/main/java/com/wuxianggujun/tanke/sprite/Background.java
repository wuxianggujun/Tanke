package com.wuxianggujun.tanke.sprite;

import com.wuxianggujun.tanke.scene.GameScene;
import javafx.scene.image.Image;

public class Background extends Sprite{

    public Background() {
        super(new Image(Background.class.getResource("/image/LevelsBackground.jpg").toExternalForm()), 0, 0, 960, 640);
    }

}
