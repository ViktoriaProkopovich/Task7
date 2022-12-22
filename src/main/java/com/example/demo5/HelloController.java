package com.example.demo5;

import com.example.demo5.model.*;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public Button startButton;
    public Button stopButton;
    public TextField seconds;
    public ImageView imageView;
    public Canvas canvas;


    private ComponentText ct;
    private ComponentAnimation ca;
    private ComponentMusic cm;
    private TimeServer timeServer = new TimeServer();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ct = new ComponentText(seconds);
        ca = new ComponentAnimation(canvas.getGraphicsContext2D());
        cm = new ComponentMusic(imageView);


    }

    public void st(ActionEvent actionEvent) {
        timeServer.attach(ct);
    }

    public void sp(ActionEvent actionEvent) {
        timeServer.detach(ct);
    }

    public void star(ActionEvent actionEvent) {
        timeServer.attach(ca);
    }

    public void sto(ActionEvent actionEvent) {
        timeServer.detach(ca);
    }

    public void startbbb(ActionEvent actionEvent) {
        timeServer.stop();
    }

    public void syop(ActionEvent actionEvent) {
        timeServer.start();
    }

    public void statata(ActionEvent actionEvent) {
        timeServer.attach(cm);
    }

    public void stopppp(ActionEvent actionEvent) {
        timeServer.detach(cm);
    }
}