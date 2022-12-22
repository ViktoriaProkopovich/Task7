package com.example.demo5.model;

public interface Subject {

    void notifyAllObserver();

    void attach(Observer obs);
    void detach(Observer obs);
    int getState();
}
