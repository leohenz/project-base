package com.efigenio.controllers;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class primeiraTelaController {
    @FXML
    private Button BtnClick;

    @FXML
    private Button BtnClick1;

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private Text txtBonito;

    @FXML
    private ImageView ImageIF;

    public void initialize() {
        txtBonito.setText("INFO-23");

        // TFCampo1.textProperty().addListener((observable, oldValue, newValue) -> {
        // System.out.println("OldValue: "+oldValue);
        // System.out.println("NewValue: "+newValue);
        // // System.out.println("textfield changed from " + oldValue + " to " +
        // newValue);
        // });

    }

    public void clickAqui() {
        System.out.println("aqui");
    }

    public void login() {
        String userBD = "user";
        String passwordBD = "senha";

        if (username.getText().equals(userBD) && password.getText().equals(passwordBD)) {
            System.out.println("logado");
        } else {
            System.out.println("Login ou senha errado!");
        }
    }

    public void trocaTexto(String txt) {

        // txtBonito.setText(TFCampo1.getText());
    }
}
