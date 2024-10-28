package com.efigenio.controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.efigenio.App;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class JanelaNotasC {

    @FXML
    private Button concluirButton;

    @FXML
    private Text notaTxt;

    @FXML
    private Text notaTxt2;

    @FXML
    private Text notaTxt3;

    @FXML
    private Text notaTxt4;

    @FXML
    private TextField textField;

    @FXML
    private TextField textField2;

    @FXML
    private TextField textField3;

    @FXML
    private TextField textField4;

    @FXML
    private Label titulo;
    @FXML
    private Double media;

    private void voltarParaCadastro() throws IOException {
        App.setRoot("cadastro");
    }
    @FXML
    private void salvarDados2() throws IOException {
        Double n1 = Double.parseDouble(textField.getText());
        Double n2 = Double.parseDouble(textField2.getText());
        Double n3 = Double.parseDouble(textField3.getText());
        Double n4 = Double.parseDouble(textField4.getText());
        
        media = (n1+n2+n3+n4) /4;

        try (BufferedWriter file = new BufferedWriter(new FileWriter("src/main/java/com/efigenio/alunos.txt", true))) {
            file.write("; " + n1 + "; " + n2 + "; " + n3 + "; " + n4 + "; " + media);
            file.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        App.setRoot("JanelaNotasC");
    }

}
