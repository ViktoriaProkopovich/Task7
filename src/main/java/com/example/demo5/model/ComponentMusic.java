package com.example.demo5.model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class ComponentMusic implements Observer {


    private TimerTask task;
    private Timer timer = new Timer();
    private Image play = new Image("start.png");
    private Image stop = new Image("Stop.png");
    private ImageView iv;

    public ComponentMusic( ImageView iv) {
        this.iv = iv;
    }
    @Override
    public void update(Subject st) {
            iv.setImage(play);
            task = new TimerTask() {
                @Override
                public void run() {
                    iv.setImage(stop);
                }
            };

            timer.schedule(task,2500);
        }
    }


