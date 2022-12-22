package com.example.demo5.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class TimeServer implements Subject{
    private Timer timer;
    private TimerTask task;
    private int timeState;

    List<Observer> observers = new ArrayList<Observer>();


    private void tick(){
        timeState++;
        notifyAllObserver();

    }
    public void stop(){timer.cancel();}

    public TimeServer(){
        this.timeState = 0;
    }

    public void start() {
            timer = new Timer();
            task = new TimerTask() {
                @Override
                public void run() {
                    tick();
                }
            };
            timer.schedule(task, 1000, 1000);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update(this);

        }
        System.out.println("Прошло:"+ timeState);
    }


    @Override
    public void attach(Observer obs) {
        observers.add(obs);

    }

    @Override
    public void detach(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public int getState() {
        return timeState;
    }
}
