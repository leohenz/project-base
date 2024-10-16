package com.efigenio.models;

public class Aluno {
    private String nome;
    private String nascimento;
    private String cpf;
    private String email;
    private Notas notas;

    public Aluno(String nome, String nascimento, String cpf, String email, Notas notas) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.email = email;
        this.notas = notas;
    }

    public String getNome(){
        return nome;
    }
    public String getNascimento(){
        return nascimento;
    }
    public String getCpf(){
        return cpf;
    }
    public String getEmail(){
        return email;
    }
    public Notas getNotas(){
        return notas;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNascimento(String nascimento){
        this.nascimento = nascimento;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setNotas(Notas notas){
        this.notas = notas;
    }
}
