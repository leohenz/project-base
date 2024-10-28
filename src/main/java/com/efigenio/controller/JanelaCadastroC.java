package com.efigenio.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldListCell;
import java.util.Scanner;

import com.efigenio.App;

import java.io.*;


public class JanelaCadastroC {

    @FXML
    private Button NotasButoon;

    @FXML
    private Button cadastarButton;

    @FXML
    private Text cpfTxt;

    @FXML
    private Text emailTxt;

    @FXML
    private Text nascimentoTxt;

    @FXML
    private Text nomeTxt;

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

    Scanner teclado = new Scanner(System.in);

    @FXML
    public void alterarParaNotas() throws IOException {
        String nome = textField.getText();
        String email = textField2.getText();
        String cpf = textField3.getText();
        String nascimento = textField4.getText();

        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
        System.out.println("Nascimento: " + nascimento);

        try (BufferedWriter file = new BufferedWriter(new FileWriter("src/main/java/com/efigenio/alunos.txt",true))) {
            file.write(""+nome+"; "+email+"; "+cpf+"; "+nascimento);
        }catch(IOException e){
            e.printStackTrace();
        }


        App.setRoot("JanelaNotasC");
    }

}

