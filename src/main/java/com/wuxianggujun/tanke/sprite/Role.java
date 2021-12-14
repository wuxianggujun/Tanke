package com.wuxianggujun.tanke.sprite;

import com.wuxianggujun.tanke.Director;
import com.wuxianggujun.tanke.scene.GameScene;
import com.wuxianggujun.tanke.util.Group;
import javafx.scene.image.Image;

import java.util.HashMap;
import java.util.Map;

public abstract class Role extends Sprite {
    boolean alive = true;
    Group group;
    Director director;
    double speed;
    Map<String,Image> imageMap=new HashMap<String,Image>();

    public Role(double x, double y, double width, double height, Group group, Director director, GameScene gameScene) {
        super(null,x, y, width, height, gameScene);
        this.group = group;
        this.director = director;
    }

}
