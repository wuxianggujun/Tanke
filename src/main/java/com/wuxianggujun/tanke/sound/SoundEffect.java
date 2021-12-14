package com.wuxianggujun.tanke.sound;


import javafx.scene.media.AudioClip;

public class SoundEffect{

    public static void play(String src){
        AudioClip audioClip = new AudioClip(SoundEffect.class.getResource(src).toExternalForm());
        audioClip.play();
    }

}
