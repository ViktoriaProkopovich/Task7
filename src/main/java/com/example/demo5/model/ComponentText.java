package com.example.demo5.model;

import javafx.scene.control.TextField;

public class ComponentText implements Observer{

    private int hours;
    private int minutes;
    private int seconds;
    private TextField textField;

    public ComponentText(TextField textField) {
        hours = 0;
        minutes = 0;
        seconds = 0;
        this.textField = textField;
    }

    @Override
    public void update(Subject st) {
        double ticks = st.getState();
        hours = (int)Math.floor(ticks / 60 / 60);
        minutes = (int)Math.floor(ticks / 60);
        seconds = (int)(ticks % 60);
        textField.setText("Прошло " + hours + " часов, " + minutes + " минут, " + seconds + " секунд");
    }
}
